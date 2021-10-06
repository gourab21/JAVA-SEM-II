#include <fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include<sys/types.h>
#include<sys/stat.h>

void copy(int,int);
void display(int);

int main(int argc, char *argv[])
{
	int fold,fnew;
	
	if (argc!=3)
 	{
    		printf("Two Arguments Reqired... \n");
    		exit(1);
  	}
	fold=open(argv[1],0);
	if(fold==-1)
	{
		printf("Unable ti Open File %s \n",argv[1]);
		exit(1);
	}
	fnew=creat(argv[2],06666);
  	if (fnew==-1)
  	{
  		printf("Unable to Create File %s \n",argv[2]);
  		exit(1);
  	}
  	copy(fold,fnew);
  	close(fold);
  	close(fnew);
  	fnew=open(argv[2],0);
  	printf("New File : \n");
  	display(fnew);
  	close(fnew);
  	exit(0);
}

void copy(int old, int new)
{
	int count=0;
	char buffer[512];
	while ((count=read(old,buffer,sizeof(buffer)))>0)
	{
		write(new,buffer,count);
	}
}
void display(int fnew)
{
	int count=0,i;
	char buffer[512];
	while ((count=read(fnew,buffer,sizeof(buffer)))>0)
	{
		for (i=0;i<count;i++)
		{
			printf("%c",buffer[i]);
		}
	}
	for (i=0;i<count;i++)
	{
		printf("%c",buffer[i]);
	}
}
	
	
	
	
	
	
	
	
	
	
