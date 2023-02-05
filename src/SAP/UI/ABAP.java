package SAP.UI;


//    PROGRAM ZARZĄDZANIA MAGAZYNEM W SAP
//
//        FUNKCJA ZASOBÓW (MM_RESOURCE_CHECK)
//
//        LOOP AT RESOURCES.
//
//        * Sprawdź ilość zasobu
//        CALL FUNCTION 'MM_RESOURCE_CHECK'
//        EXPORTING
//        RESOURCE = RESOURCES-ID
//        IMPORTING
//        AVAILABLE = RESOURCES-AVAILABLE.
//
//        * Aktualizuj stan magazynu
//        CALL FUNCTION 'MM_RESOURCE_UPDATE'
//        EXPORTING
//        RESOURCE = RESOURCES-ID
//        AVAILABLE = RESOURCES-AVAILABLE.
//
//        * Sprawdź możliwość realizacji zamówienia
//        CALL FUNCTION 'MM_ORDER_CHECK'
//        EXPORTING
//        ORDER = ORDER-ID
//        IMPORTING
//        AVAILABLE = ORDER-AVAILABLE.
//
//        ENDLOOP.
//
//        * Wyślij potwierdzenie dostawy
//        CALL FUNCTION 'MM_RESOURCE_CONFIRM'
//        EXPORTING
//        ORDER = ORDER-ID.
//
//        * Sprawdź możliwość realizacji zamówienia
//        CALL FUNCTION 'MM_ORDER_CHECK'
//        EXPORTING
//        ORDER = ORDER-ID
//        IMPORTING
//        AVAILABLE = ORDER-AVAILABLE.
//
//        * Wyślij potwierdzenie zamówienia
//        CALL FUNCTION 'MM_ORDER_CONFIRM'
//        EXPORTING
//        ORDER = ORDER-ID.
