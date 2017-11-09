package org.dc.mavenprojects.plugin.assembly;

import org.joda.time.DateTimeZone;

public class RunnableAssemblyPlugin {
	public static void main(String[] args) {
		System.out.println("Hello World! :: Runnable Jar Via Maven Assembly Plugin :: Using Joda :: " + DateTimeZone.getDefault());
	}
}
