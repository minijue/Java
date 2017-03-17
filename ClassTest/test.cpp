/*
 * test.cpp

 *
 *  Created on: 2017年3月17日
 *      Author: wangjue
 */
#include "Student.h"

int main() {
	Student s1 { "zhang3", 72.0, 79.5 };
	s1.dispaly();

	Student::rate = 0.3;
	Student *ps1 = new Student("liang4", 60, 100);
	ps1->dispaly();
	delete ps1;

	return 0;
}

