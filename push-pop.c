#include<stdio.h>
#include<stdlib.h>


int [a], top = -1;

void push();
void pop();
void display();

int main() {
    int ch;

    printf("1. PUSH or Insert\n");
    printf("2. POP or Delete\n");
    printf("3. Display\n");
    printf("4. End the program\n");

    while (1) {
        printf("\nEnter choice: ");
        scanf("%d", &ch);

        switch (ch) {
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
            default:
                printf("Wrong choice\n");
        }
    }

    return 0;
}

void push() {
    int data;
    if (top == n - 1) {
        printf("\nOverflow or Stack is full\n");
    } else {
        printf("Enter Element to be Pushed: ");
        scanf("%d", &data);
        top++;
        a[top] = data;
    }
}

void pop() {
    if (top == -1) {
        printf("Underflow or Stack is Empty\n");
    } else {
        printf("Popped Element: %d\n", a[top]);
        top--;
    }
}

void display() {
    int i;
    if (top >= 0) {
        printf("Elements:\n");
        for (i = top; i >= 0; i--) {
            printf("%d\n", a[i]);
        }
    } else {
        printf("The Stack is Empty\n");
    }
}