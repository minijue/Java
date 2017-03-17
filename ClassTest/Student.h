/*
 * Student.h
 *
 *  Created on: 2017年3月17日
 *      Author: wangjue
 */

#ifndef STUDENT_H_
#define STUDENT_H_
#include <string>
using namespace std;

class Student {
public:
	Student() = default;
	explicit Student(string name, double nv, double ev);

	void dispaly() const;

	static double rate;
private:
	string name;
	double normScore = 0.0;
	double examScore = 0.0;
};

#endif /* STUDENT_H_ */
