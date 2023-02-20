package org.ssglobal.training.codes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MathOp {

	// 1 create or build the private logger object

	private Logger logger = Logger.getLogger(MathOp.class.getName());

	public MathOp() {
		// 2 set the level of the logging
		logger.setLevel(Level.ALL);

		// 3 create another handler
		try {
			FileHandler filehander = new FileHandler("./src/config/math.log", true);
			filehander.setLevel(Level.ALL);
			filehander.setEncoding("UTF-8");
			
			// 4 create Format
			SimpleFormatter txtFormat = new SimpleFormatter();
			filehander.setFormatter(txtFormat);

			logger.addHandler(filehander);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public MathOp(int x, int y) {
		logger.setLevel(Level.ALL);

		// 3 create another handler
		try {
			FileHandler filehander = new FileHandler("./src/config/math.log", true);
			filehander.setLevel(Level.ALL);
			filehander.setEncoding("UTF-8");
			
			// 4 create Format
			SimpleFormatter txtFormat = new SimpleFormatter();
			filehander.setFormatter(txtFormat);

			logger.addHandler(filehander);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public int add(int x, int y) {
		logger.info("start of method add() with paramters x = %d y = %d".formatted(x, y));

		logger.warning("using custom Date() object is depricated");
		Date xmas = new Date(123, 1, 32);
		System.out.println(xmas);

		int sum = x + y;
		logger.info("end of method div() with paramters x = %d y = %d".formatted(x, y));
		return sum;
	}

	public int div(int x, int y) throws ArithmeticException, Exception {
		logger.info("start of method div() with paramters x = %d y = %d".formatted(x, y));
		if (y == 0) {
			logger.severe("division by zero error");
			throw new ArithmeticException();
		}

		logger.info("end of method div() with paramters x = %d y = %d".formatted(x, y));
		return x / y;
	}

	public int[] display(int[] arrData) {
		logger.info("start of method display() with paramters arrData = %s".formatted(Arrays.toString(arrData)));
		try {
			int len = arrData.length;
			System.out.println("length of array: %d".formatted(len));
			System.out.println(Arrays.toString(arrData));
		} catch (NullPointerException e) {
			logger.severe(e.getMessage());
		}
		logger.info("end of method display() with paramters arrData = %s".formatted(Arrays.toString(arrData)));
		return arrData;
	}

}
