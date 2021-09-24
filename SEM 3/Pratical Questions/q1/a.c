
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>

int main()
{
  pid_t a,pid;
  a=fork();
  pid=getpid();

  if (a < 0)
    fprintf(stderr, "Error in fork()");
  else
    printf("Output of Fork ID : %d\n", a);
    printf("Process ID : %d\n", pid);

  return 0;
}
