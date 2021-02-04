set projectLocation=C:\Users\Dell\eclipse-workspace\orange_hrm_frameworks14
cd%projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.testNG %projectLocation%\testng.xml