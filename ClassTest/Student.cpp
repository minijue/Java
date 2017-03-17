/*
 * Student.cpp
 *
 *  Created on: 2017年3月17日
 *      Author: wangjue
 */

#include "Student.h"
#include <iostream>

double Student::rate = 0.5;

Student::Student(string n, double nv, double ev) :
		name(n), normScore(nv), examScore(ev) {
}

void Student::dispaly() const {
	std::cout << name << "\t" << normScore << "\t"
			<< normScore * rate + examScore * (1 - rate) << std::endl;
}
