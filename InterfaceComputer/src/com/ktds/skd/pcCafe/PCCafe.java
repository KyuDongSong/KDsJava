package com.ktds.skd.pcCafe;

import com.ktds.skd.Computer;
import com.ktds.skd.AppleComputer;
import com.ktds.skd.SamsungComputer;
import com.ktds.skd.LGComputer;

public class PCCafe {
	public static void main(String[] args) {
		Computer[] computers = new Computer[5];

		computers[0] = new SamsungComputer();
		computers[1] = new LGComputer();
		computers[2] = new SamsungComputer();
		computers[3] = new AppleComputer();
		computers[4] = new LGComputer();

		for (Computer computer : computers) {
			computer.input();
			computer.compute();
			computer.store();

			if (computer instanceof AppleComputer) {
				((AppleComputer) computer).faceTime();
			}
		}
	}
}
