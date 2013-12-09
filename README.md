ch01
====

changes:
* add to <dependencies>

        <dependency>
		<groupId>commons-dbcp</groupId>
		<artifactId>commons-dbcp</artifactId>
		<version>1.4</version>
	</dependency>
		
* download ojdbc6.jar for Oracle JDBC driver. Expand and save to local directory.
* Right click on the propject and select "Build Path->Add Libraries->User Library". 
* Name the library and add an external Jar to the library. Find and select ojdbc6.jar.

This application uses Oracle database. Download the express edition for oracle. As alternative,
you can use the virtual VM in this site: http://tech.lds.org/wiki/Oracle_VM
Follow the instruction to install Oracle Express running in Linux VM.

To know more about JDBC connection to Oracle see: http://www.orafaq.com/wiki/JDBC

![alt sts-ch01](https://raw.github.com/ilearnspring/ch01/master/sts-ch01.png)

