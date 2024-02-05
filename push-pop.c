#include<stdio.h>
#include<conio.h>
#define MAX 5

int a[MAX] , top = -1 ;
void push();
void pop();
void disp();

int main()
{
    int ch;
    printf("1. PUSH or Insert \n");
    printf("2. POP or Delete  \n");
    printf("3. Display \n");
    printf("4. End the program \n");
    
    while(1)
    {
        printf("\n Enter choice : ");
        scanf("D",ch);
        
        switch(ch)
        {
            case 1:
            {
                push();
                break;
            }
            case 2:
            {
                pop();
                break;
            }
            case 3:
            {
                display();
                break;
            }
            case 4:
            {
                exit(0);
            }
            default:
            {
                printf("Wrong choice");
            }
        }
        break;
    }
}
void push()
{
    int data;
    if(top==MAX-1)
    {
        printf("\n Overflow or Stack is full ");
    }
    else
    {
        printf("Enter Elements to be Pushed");
        scanf("D",&data);
        top++;
        a[top]=data;
    }
}
void pop()
{
    if(top==-1)
    {
        printf("Underflow or Stack is Empty");
    }
    else
    {
        printf("Popped Element  : %d",a[top]);
        top--;
    }
}
void display()
{
    int i;
    if(top>=0)
    {
        printf("Elements :");
        for(i=top;i>=0;i--)
        {
            printf("\n d",a[i]);
        }
        
    }
    else
    {
        printf("The Stack is Empty");
    }
}
