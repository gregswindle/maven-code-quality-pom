## maven-code-quality-pom

-----

  - Last Published: 2017-11-10|
  - Version: 0.0.1-SNAPSHOT

<!-- end list -->

  - Code Quality Reports
  - [Unit Tests](surefire-report.md "Unit Tests")
      - [Code Coverage
        (JaCoCo)](jacoco/index.md "Code Coverage (JaCoCo)")
      - [Results (Surefire)](surefire-report.md "Results (Surefire)")
      - [Unit Test
        Javadocs](testapidocs/index.md "Unit Test Javadocs")
      - [Unit Test Source
        Code](xref-test/index.md "Unit Test Source Code")
  - [Coding Standards](checkstyle.md "Coding Standards")
      - [Checkstyle](checkstyle.md "Checkstyle")
      - [CPD](cpd.md "CPD")
      - [FindBugs](findbugs.md "FindBugs")
      - [JDepend](jdepend-report.md "JDepend")
      - [PMD](pmd.md "PMD")
  - [Dependencies](dependency-updates-report.md "Dependencies")
  - [Security Vulnerabilities](#)
      - [CodeNarc](#)
      - [Dependency
        Check](dependency-check-report.md "Dependency Check")
  - [Source Code](xref/index.md "Source Code")
      - [Java](xref/index.md "Java")
      - [Javadocs](apidocs/index.md "Javadocs")
  - Contributions
  - [Change Log](changelog.md "Change Log")
  - [Contributors](dev-activity.md "Contributors")
  - [Commits/Changes](file-activity.md "Commits/Changes")
  - Project Documentation
  - [Project Information](project-info.md "Project Information")
  - [Project Reports](project-reports.md "Project Reports")
      - [Surefire Report](surefire-report.md "Surefire Report")
      - [JaCoCo](jacoco/index.md "JaCoCo")
      - [JaCoCo
        Aggregate](jacoco-aggregate/index.md "JaCoCo Aggregate")
      - [CodeNarc
        Report](#)
      - [FindBugs](findbugs.md "FindBugs")
      - [Checkstyle](checkstyle.md "Checkstyle")
      - [CPD](cpd.md "CPD")
      - [PMD](pmd.md "PMD")
      - [JDepend](jdepend-report.md "JDepend")
      - [dependency-check](dependency-check-report.md "dependency-check")
      - [Dependency
        Analysis](dependency-analysis.md "Dependency Analysis")
      - [Dependency Updates
        Report](dependency-updates-report.md "Dependency Updates Report")
      - [Plugin Updates
        Report](plugin-updates-report.md "Plugin Updates Report")
      - [Property Updates
        Report](property-updates-report.md "Property Updates Report")
      - [Source Xref](xref/index.md "Source Xref")
      - [Test Source Xref](xref-test/index.md "Test Source Xref")
      - [Javadoc](apidocs/index.md "Javadoc")
      - [Test Javadoc](testapidocs/index.md "Test Javadoc")
      - [Change Log](changelog.md "Change Log")
      - [File Activity](file-activity.md "File Activity")
      - [Developer Activity](dev-activity.md "Developer Activity")
      - [Third Parties](third-party-report.md "Third Parties")

-----

[![Built by
Maven](./images/logos/maven-feather.png)](http://maven.apache.org/ "Built by Maven")

## CodeNarc Report

The following document contains the results of [CodeNarc
Report](http://codenarc.sourceforge.net)

CodeNarc Version: *0.22*

Report Time: *Nov 10, 2017 12:50:23
AM*

## Summary

| Total Files | Bug Files | Bugs | Priority1 Bugs | Priority2 Bugs | Priority3 Bugs |
| ----------- | --------- | ---- | -------------- | -------------- | -------------- |
| 0           | 0         | 0    | 0              | 0              | 0              |

## Package Summary

| Package | Total Files | Bug Files | Bugs | Priority1 Bugs | Priority2 Bugs | Priority3 Bugs |
| ------- | ----------- | --------- | ---- | -------------- | -------------- | -------------- |

## Files

## Rule Description

Rule Name

Description

AssertWithinFinallyBlock

Checks for assert statements within a finally block. An assert can throw
an exception, hiding the original exception, if there is one.

AssignmentInConditional

An assignment operator (=) was used in a conditional test. This is
usually a typo, and the comparison operator (==) was intended.

BigDecimalInstantiation

Checks for calls to the BigDecimal constructors that take a double
parameter, which may result in an unexpected BigDecimal value.

BitwiseOperatorInConditional

Checks for bitwise operations in conditionals, if you need to do a
bitwise operation then it is best practive to extract a temp variable.

BooleanGetBoolean

This rule catches usages of java.lang.Boolean.getBoolean(String) which
reads a boolean from the System properties. It is often mistakenly used
to attempt to read user input or parse a String into a boolean. It is a
poor piece of API to use; replace it with System.properties\['prop'\].

BrokenNullCheck

Looks for faulty checks for null that can cause a NullPointerException.

BrokenOddnessCheck

The code uses x % 2 == 1 to check to see if a value is odd, but this
won't work for negative numbers (e.g., (-5) % 2 == -1). If this code is
intending to check for oddness, consider using x & 1 == 1, or x % 2 \!=
0.

CatchArrayIndexOutOfBoundsException

Check the size of the array before accessing an array element rather
than catching ArrayIndexOutOfBoundsException.

CatchError

Catching Error is dangerous; it can catch exceptions such as ThreadDeath
and OutOfMemoryError.

CatchException

Catching Exception is often too broad or general. It should usually be
restricted to framework or infrastructure code, rather than application
code.

CatchIllegalMonitorStateException

Dubious catching of IllegalMonitorStateException.
IllegalMonitorStateException is generally only thrown in case of a
design flaw in your code (calling wait or notify on an object you do not
hold a lock on).

CatchIndexOutOfBoundsException

Check that an index is valid before accessing an indexed element rather
than catching IndexOutOfBoundsException.

CatchNullPointerException

Catching NullPointerException is never appropriate. It should be avoided
in the first place with proper null checking, and it can mask underlying
errors.

CatchRuntimeException

Catching RuntimeException is often too broad or general. It should
usually be restricted to framework or infrastructure code, rather than
application code.

CatchThrowable

Catching Throwable is dangerous; it can catch exceptions such as
ThreadDeath and OutOfMemoryError.

ClassForName

Using Class.forName(...) is a common way to add dynamic behavior to a
system. However, using this method can cause resource leaks because the
classes can be pinned in memory for long periods of time.

ComparisonOfTwoConstants

Checks for expressions where a comparison operator or equals() or
compareTo() is used to compare two constants to each other or two
literals that contain only constant values, e.g.: 23 == 67,
Boolean.FALSE \!= false, 0.17 \<= 0.99, "abc" \> "ddd", \[a:1\] \<=\>
\[a:2\], \[1,2\].equals(\[3,4\]) or \[a:false,
b:true\].compareTo(\['a':34.5, b:Boolean.TRUE\], where x is a variable.

ComparisonWithSelf

Checks for expressions where a comparison operator or equals() or
compareTo() is used to compare a variable to itself, e.g.: x == x, x \!=
x, x \<=\> x, x \< x, x \>= x, x.equals(x) or x.compareTo(x), where x is
a variable.

ConfusingClassNamedException

This class is not derived from another exception, but ends with
'Exception'. This will be confusing to users of this class.

ConstantAssertExpression

Checks for assert statements where the assert boolean condition
expression is a constant or literal value.

ConstantIfExpression

Checks for if statements with a constant value for the if expression,
such as true, false, null, or a literal constant value.

ConstantTernaryExpression

Checks for ternary expressions with a constant value for the boolean
expression, such as true, false, null, or a literal constant value.

DeadCode

Dead code appears after a return statement or an exception is thrown. If
code appears after one of these statements then it will never be
executed and can be safely deleted.

DoubleNegative

There is no point in using a double negative, it is always positive. For
instance \!\!x can always be simplified to x. And \!(\!x) can as well.

DuplicateCaseStatement

Check for duplicate case statements in a switch block, such as two equal
integers or strings.

DuplicateImport

Duplicate import statements are unnecessary.

DuplicateMapKey

A map literal is created with duplicated key. The map entry will be
overwritten.

DuplicateSetValue

A Set literal is created with duplicate constant value. A set cannot
contain two elements with the same value.

EmptyCatchBlock

In most cases, exceptions should not be caught and ignored (swallowed).

EmptyClass

Reports classes without methods, fields or properties. Why would you
need a class like this?

EmptyElseBlock

Empty else blocks are confusing and serve no purpose.

EmptyFinallyBlock

Empty finally blocks are confusing and serve no purpose.

EmptyForStatement

Empty for statements are confusing and serve no purpose.

EmptyIfStatement

Empty if statements are confusing and serve no purpose.

EmptyInstanceInitializer

An empty class instance initializer was found. It is safe to remove it.

EmptyMethod

A method was found without an implementation. If the method is
overriding or implementing a parent method, then mark it with the
@Override annotation.

EmptyStaticInitializer

An empty static initializer was found. It is safe to remove it.

EmptySwitchStatement

Empty switch statements are confusing and serve no purpose.

EmptySynchronizedStatement

Empty synchronized statements are confusing and serve no purpose.

EmptyTryBlock

Empty try blocks are confusing and serve no purpose.

EmptyWhileStatement

Empty while statements are confusing and serve no purpose.

EqualsAndHashCode

If either the equals(Object) or the hashCode() methods are overridden
within a class, then both must be overridden.

EqualsOverloaded

The class has an equals method, but the parameter of the method is not
of type Object. It is not overriding equals but instead overloading it.

ExceptionExtendsError

Errors are system exceptions. Do not extend them.

ExceptionExtendsThrowable

Checks for classes that extend Throwable. Custom exception classes
should subclass Exception or one of its descendants.

ExceptionNotThrown

Checks for an exception constructor call without a throw as the last
statement within a catch block.

ExplicitGarbageCollection

Calls to System.gc(), Runtime.getRuntime().gc(), and
System.runFinalization() are not advised. Code should have the same
behavior whether the garbage collection is disabled using the option
-Xdisableexplicitgc or not. Moreover, "modern" jvms do a very good job
handling garbage collections. If memory usage issues unrelated to memory
leaks develop within an application, it should be dealt with JVM options
rather than within the code itself.

ForLoopShouldBeWhileLoop

A for loop without an init and update statement can be simplified to a
while loop.

HardCodedWindowsFileSeparator

This rule finds usages of a Windows file separator within the
constructor call of a File object. It is better to use the Unix file
separator or use the File.separator constant.

HardCodedWindowsRootDirectory

This rule find cases where a File object is constructed with a
windows-based path. This is not portable, and using the File.listRoots()
method is a better alternative.

ImportFromSamePackage

An import of a class that is within the same package is unnecessary.

ImportFromSunPackages

Avoid importing anything from the 'sun.\*' packages. These packages are
not portable and are likely to change.

IntegerGetInteger

This rule catches usages of java.lang.Integer.getInteger(String, ...)
which reads an Integer from the System properties. It is often
mistakenly used to attempt to read user input or parse a String into an
Integer. It is a poor piece of API to use; replace it with
System.properties\['prop'\].

MisorderedStaticImports

Static imports should never be declared after nonstatic imports.

MissingNewInThrowStatement

A common Groovy mistake when throwing exceptions is to forget the new
keyword. For instance, "throw RuntimeException()" instead of "throw new
RuntimeException()". If the error path is not unit tested then the
production system will throw a Method Missing exception and hide the
root cause. This rule finds constructs like "throw RuntimeException()"
that look like a new keyword was meant to be used but forgotten.

MultipleUnaryOperators

Checks for multiple consecutive unary operators. These are confusing,
and are likely typos and bugs.

NoWildcardImports

Wildcard imports, static or otherwise, should not be used.

RandomDoubleCoercedToZero

The Math.random() method returns a double result greater than or equal
to 0.0 and less than 1.0. If you coerce this result into an Integer or
int, then it is coerced to zero. Casting the result to int, or assigning
it to an int field is probably a bug.

RemoveAllOnSelf

Don't use removeAll to clear a collection. If you want to remove all
elements from a collection c, use c.clear, not c.removeAll(c). Calling
c.removeAll(c) to clear a collection is less clear, susceptible to
errors from typos, less efficient and for some collections, might throw
a ConcurrentModificationException.

ReturnFromFinallyBlock

Returning from a finally block is confusing and can hide the original
exception.

ReturnNullFromCatchBlock

Returning null from a catch block often masks errors and requires the
client to handle error codes. In some coding styles this is discouraged.

SwallowThreadDeath

Checks for code that catches ThreadDeath without re-throwing it.

ThrowError

Checks for throwing an instance of java.lang.Error.

ThrowException

Checks for throwing an instance of java.lang.Exception.

ThrowExceptionFromFinallyBlock

Throwing an exception from a finally block is confusing and can hide the
original exception.

ThrowNullPointerException

Checks for throwing an instance of java.lang.NullPointerException.

ThrowRuntimeException

Checks for throwing an instance of java.lang.RuntimeException.

ThrowThrowable

Checks for throwing an instance of java.lang.Throwable.

UnnecessaryGroovyImport

A Groovy file does not need to include an import for classes from
java.lang, java.util, java.io, java.net, groovy.lang and groovy.util, as
well as the classes java.math.BigDecimal and java.math.BigInteger.

UnusedImport

Imports for a class that is never referenced within the source file is
unnecessary.

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
