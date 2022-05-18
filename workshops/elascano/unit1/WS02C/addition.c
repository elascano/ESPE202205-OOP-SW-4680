#include <stdio.h>

int main(){
	float addend1;
	float addend2;
	float sum;
	addend1 = 20.2;
	addend2 = 20.4;

	sum = addend1 + addend2;

	printf("The sum of %.2f + %.2f is %.2f\n", addend1, addend2, sum);

	printf("-> %f \n", sum + 20);

}
