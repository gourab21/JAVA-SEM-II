

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/types.h>

int main()
{
  pid_t pidFork = fork();

  if (pidFork > 0)
  {
    wait(NULL);
    printf("PARENT: Child Exited\n");
  }
  else
  {
    printf("CHILD: Process ID: %d\n", getpid());
    printf("CHILD: Parent Process ID: %d\n", getppid());
    exit(0);
  }

  return 0;
}
