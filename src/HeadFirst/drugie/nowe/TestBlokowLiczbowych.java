package HeadFirst.drugie.nowe;

public class TestBlokowLiczbowych {
    public static void  main(String [] args)
    {
        int x=0;
        int y=0;
        while(x<5) {
//----------------------------------------------------------------------------------------------------------------------
//            y = x - y;
//             output 0 0 1 1 2 1 3 2 4 2
//----------------------------------------------------------------------------------------------------------------------
//            y=y+x;
//             output 0 0 1 1 2 3 3 6 4 10
//----------------------------------------------------------------------------------------------------------------------
//            y=y+2;
//            if(y>4)
//            {
//                y=y-1;
//            }
//             output 0 2 1 4 2 5 3 6 4 7
//----------------------------------------------------------------------------------------------------------------------
//            x=x+1;
//            y=y+x;
//            output 1 1 3 4 5 9
//----------------------------------------------------------------------------------------------------------------------
            if (x < 5)
            {
                x=x+1;
                if(y<3)
                {
                    x=x-1;
                }
            }
            y=y+2;
//            output 0 2 1 4 3 6 5 8
//----------------------------------------------------------------------------------------------------------------------
            System.out.print(x + " " + y + " ");
            x = x + 1;
        }
    }
}