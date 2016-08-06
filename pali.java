Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=new StringBuffer (a).reverse().toString();            //).reverse().toString();
        if(a.equals(b))
        {
                System.out.println("strings are equal");
            
            
        }else
        {
            System.out.println("strings are not equal");
        }