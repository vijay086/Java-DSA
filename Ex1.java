#include<stdio.h>
#include<conio.h>
#define n 5
void insert();
void delet();
void display();
int f=-1,r=-1,q[n];
void main()
	{
		int ch;
		clrscr();
		do
		{
			clrscr();
			printf("\n \n\t\t MENU");
			printf("\n 1. Insert");
			printf("\n 2. Delete");
			printf("\n 3. Display");
			printf("\n 4. Exit");
		printf("\n Enter your choice");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				insert();
				getch();
				break;
			case 2:
				delet();
				getch();
				break;
			case 3:
				display();
				getch();
				break;
			case 4:
				exit(0);
				break;
		}
	}while(ch>=1 && ch<=4);
getch();
}
void insert()
{
	if((r==n-1 && f==0) || (r==f-1))
	{
		printf("\n Sorry queue is overflow");
		return;
	}
	else if(f==-1)
		{
			f=0;
			r=0;
			printf("\n Enter value in queue");
			scanf("%d",&q[r]);
			printf("\n %d is inserted in queue",q[r]);
		}
	else if(r==n-1)
		{

			r=0;
			printf("\n Enter value in queue");
			scanf("%d",&q[r]);
			printf("\n %d is inserted in queue",q[r]);
		}
	else
		{

			r++;
			printf("\n Enter value in queue");
			scanf("%d",&q[r]);
			printf("\n %d is inserted in queue",q[r]);
		}
}
void delet()
{
	if(f==-1)
		printf("\n Queue is empty");
	printf("\n %d is deleted",q[f]);
	if(f==r)
	{
		f=-1;
		r=-1;
	}
	else if(f==n-1)
		f=0;
	else
		f++;
}
void display()
{
  int i;
	   if(f==-1)
	   {
		printf("\n Sorry queue is empty");
		return;
	   }
	   else if (r>=f)
	   {
		for(i=f;i<=r;i++)
		printf("\t %d",q[i]);
	   }
	   else
	   {
		for(i=f;i<n;i++)
			printf("\t %d",q[i]);
		for(i=0;i<=r;i++)
			printf("\t %d",q[i]);
	   }

}