@echo off
echo Compiling project...

javac -d bin -sourcepath src src/SimpleLang.java src/main/ast/**/*.java src/main/visitor/**/*.java

echo Running test cases...
(
echo 1:
java -cp bin SimpleLang ./sample-wag/sample1.mol
echo 2:
java -cp bin SimpleLang ./sample-wag/sample2.mol
echo 3:
java -cp bin SimpleLang ./sample-wag/sample3.mol
echo 4:
java -cp bin SimpleLang ./sample-wag/sample4.mol
echo 5:
java -cp bin SimpleLang ./sample-wag/sample5.mol
echo 6:
java -cp bin SimpleLang ./sample-wag/sample6.mol
echo 7:
java -cp out SimpleLang ./sample-wag/sample7.mol
echo 8:
java -cp bin SimpleLang ./sample-wag/sample8.mol
) > my_all_outputs.txt

echo Done! Checking differences...
pause