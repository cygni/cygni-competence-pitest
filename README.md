# cygni-competence-pitest
A tutorial in using PITest

This tutorial is divided into three steps. The steps are defined in
different git branches. step-{1,2,3}. The solution to each step is in
another branch, step-{1,2,3}-solution.

Your task is to create Unit-tests that kills all generated code 
mutations!

A suggestion is to write a Unit-test and then run the pitest plugin 
with either Maven or Gradle as shown below. Then inspect the generated
report and try to add more tests that kills the defunct mutations 
generated by pitest. 


##Gradle

gradle pitest

Reports are in builds/reports/pitest/datetime/

##Maven

mvn org.pitest:pitest-maven:mutationCoverage

Reports are in target/pit-reports/datetime/
