       Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int z=sc.nextInt();
        
while(z!=0)
        {
            a[i]=z%10;
            count++;
            i++;
        z=z/10;
        
}
      for(i=0;i<count;i++)
        {
           z1=z1*a[i];
          
        }
        System.out.println(""+z1);
 
    }
    
}