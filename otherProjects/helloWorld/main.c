#include <stdio.h>

void welcome(char *name) {

	printf("Hello %s, Welcome to our World!\n", name);

}

int main (int argv, char* argc[]) {

	char *cadet = "cadet";
         
        if (argc[1]) {
                 cadet = argc[1];
        }

   welcome (cadet);


}
