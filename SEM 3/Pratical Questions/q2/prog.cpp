#include<iostream>
using namespace std;
#include<stdlib.h>
#include<stdio.h>

int main()
{
cout<<"\n The Kernel version is : \n";
system("cat /proc/sys/kernel/osrelease");
cout<<("\n The CPU space : \n ");
system("cat /proc/cpuinfo |awk 'NR==3,NR==4{print}'\n ");
cout<<"\n Amount of CPU time since system was last booted is : ";
system("cat /proc/uptime\n");
cout<<"\n The  configured memory is :\n";
system("cat /proc/meminfo | awk 'NR == 1 {print $2}'\n");
cout<<"\n Amount of free memory is : \n";
system("cat /proc/meminfo | awk 'NR == 2{print $2}' \n");
cout<<"\n Amount of free memory is : \n";
system("cat /proc/meminfo | awk '{if (NR==1) a=$2; if (NR==2) b=$2} END {print a-b}'\n");
cout<<endl;
return 0;  
}
