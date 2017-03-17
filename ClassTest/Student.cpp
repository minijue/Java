/*
 * Student.cpp
 *
 *  Created on: 2017年3月17日
 *      Author: wangjue
 */

#include "Student.h"

int Student::rate = 0.5;

Student::Student(string n, double nv, double ev) :
		name(n), normScore(nv), examScore(ev) {
}
