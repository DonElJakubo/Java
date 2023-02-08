alter procedure pMigracje


    as
    INSERT INTO  Dest.dbo.Correspondence
    (Description)
SELECT distinct d.data
FROM [Source].[dbo].[case_document_data] d
WHERE d.userdocumentfieldid = 'BF306480-46A0-475D-8144-A98500A81BDBB'
  AND NOT EXISTS(select count(a.Date)
    from Dest.dbo.Correspondence a
    group by a.Date
    )


INSERT INTO  Dest.dbo.Correspondence
(Link)
SELECT distinct b.data as [File Path]
FROM [Source].[dbo].[case_document_data] b
WHERE b.userdocumentfieldid = '2B0709FF-53CD-4E39-9C06-A98500A81BDB'
  and b.data IN ( SELECT case_document_data.data
    FROM [Source].[dbo].[case_document_data]
    WHERE case_document_data.data IN
    (SELECT case_document_data.data
    FROM [Source].[dbo].[case_document_data]
    WHERE	case_document_data.data LIKE '%Medical Request%')
   or case_document_data.data IN
    (SELECT case_document_data.data
    FROM [Source].[dbo].[case_document_data]
    WHERE	case_document_data.data LIKE '%Notice Letters%')
   or case_document_data.data IN
    (SELECT case_document_data.data
    FROM [Source].[dbo].[case_document_data]
    WHERE	case_document_data.data LIKE  '%Settlement Negotiations%' )
   or case_document_data.data IN
    (SELECT case_document_data.data
    FROM [Source].[dbo].[case_document_data]
    WHERE	case_document_data.data LIKE  '%Correspondence%'))
  AND NOT EXISTS(select count(a.CorrespondID)
    from Dest.dbo.Correspondence a
    group by a.CorrespondID
    );



INSERT INTO  Dest.dbo.Correspondence
(Date)
SELECT distinct c.data
FROM [Source].[dbo].[case_document_data] c
WHERE c.userdocumentfieldid = '97ED1568-5AB8-4F49-8CE6-A98500A81BDC'
  AND NOT EXISTS(select count(a.Date)
    from Dest.dbo.Correspondence a
    group by a.Date
    )

select count(a.Description) as description
     , count(a.Date) as date
from Dest.dbo.Correspondence a
group by a.Description, a.Date
order by description;


select a.Date, count(a.date) as duplicates
from  Dest.dbo.Correspondence a
group by a.Date
having count(a.date) > 1;


select a.Description as [nazwa duplikatu], count(a.Description) as [liczba duplikatów]
from  Dest.dbo.Correspondence a
group by a.Description
having count(a.Description) > 1;

SELECT a.data
FROM source.dbo.case_document_data a
where a.userdocumentfieldid = 'B9BC3522-1C9C-4758-ADE2-A98500A81BDB'
  and a.data IN  (SELECT case_document_data.data
                  FROM [Source].[dbo].[case_document_data]
WHERE case_document_data.data IN
    (SELECT case_document_data.data
    FROM [Source].[dbo].[case_document_data]
    WHERE	case_document_data.data LIKE '%Medical Request%')
   or case_document_data.data IN
    (SELECT case_document_data.data
    FROM [Source].[dbo].[case_document_data]
    WHERE	case_document_data.data LIKE '%Notice Letters%')
   or case_document_data.data IN
    (SELECT case_document_data.data
    FROM [Source].[dbo].[case_document_data]
    WHERE	case_document_data.data LIKE  '%Settlement Negotiations%' )
   or case_document_data.data IN
    (SELECT case_document_data.data
    FROM [Source].[dbo].[case_document_data]
    WHERE	case_document_data.data LIKE  '%Correspondence%'))
order by a.data asc;

select  a.CorrespondID, a.Date, a.Link, a.Description
from  Dest.dbo.Correspondence a
where a.Date is not null
   or a.Description is not null
   or a.Link is not null
order by a.CorrespondID, a.Date, a.Description