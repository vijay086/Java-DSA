#include<stdio.h>
#include<conio.h>


void findWaitingTime(int processes [], int n,

int bt[], int wt [])

{ 
    wt [0] = 0;



for (int i = 1; i < n; i++)

    wt[i] = bt[i-1] + wt[i-1];

}

// Function to calculate turn around time

void findTurnAroundTime ( int processes[], int n, int bt[], int wt[], int tat[]) {

// calculating turnaround time by adding

//bt[i] + wt[i]

for (int i = 0; i < n; i++)

tat[i] = bt[i] + wt[i];

}

void findavgTime( int processes[], int n, int bt[])

{ 
    int wt [100], tat [100], total_wt = 0, total_tat = 0;
    
    // Function to find the waiting time of all processes 
    findWaitingTime(processes, n, bt, wt);
    
    // Function to find turn around time for all processes 
    findTurnAroundTime (processes, n, bt, wt, tat);
    
    // Display processes along with all details 
    printf ("Processes Burst time Waiting time Turn around ti");

// Calculate total waiting time and total turn 
// around time 
for (int i=0; i<n; i++)
{

total_wt = total_wt + wt[i];

total_tat = total_tat + tat[i];
total_tat = total_tat + tat[i];

printf("%d", (i+1));

printf("%d", bt[i]);

printf("%d",wt[i]);

printf("%d\n", tat[i]);

}

float s=(float)total_wt / (float)n;

float t=(float)total_tat / (float)n;

printf( "Average waiting time = %f", s);

printf("\n");

printf("Average turn around time = %f ",t);

}

int main()

{

int processes[] = {1, 2, 3};

int n = sizeof processes / sizeof processes[0];

int burst_time[] = {10, 5, 8};

findavgTime (processes, n, burst_time);

getch();

printf("%d\n",tat[i]);
}

float s=(float)total_wt/ (float)n;

float t=(float)total_tat / (float)n; 

printf("Average waiting time = %f",s); 
printf("");

printf("nverage turn around time = %f",t); 

}

int main()

{

int processes[] = {1, 2, 3};

int n = sizeof processes / sizeof processes[0];

int burst_time [] = {10, 5, 8);

findavgTime (processes, n, burst_time);

getch();

return 0;

}
