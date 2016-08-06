       Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int p=sc.nextInt();
        int d=sc.nextInt();
while(p!=0)
        {
            a[i]=p%10;
            c++;
            i++;
        p=p/10;
        }
        int t;
        for(j=0;j<i-1;j++)
        {
            for(int k=j+1;k<i;k++)
            {
                       if(a[j]>a[k])
            {
              t=a[j];
              a[j]=a[k];
              a[k]=t;
                
            }
        }
    }
for(j=0;j<c-d;j++)   
{
        System.out.print(""+a[j]);
}
    }
    
}