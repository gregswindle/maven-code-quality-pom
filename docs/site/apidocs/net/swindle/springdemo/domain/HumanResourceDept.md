JavaScript is disabled on your browser.

[Skip navigation
    links](#skip.navbar.top "Skip navigation links")

  - [Overview](../../../../overview-summary.md)
  - [Package](package-summary.md)
  - Class
  - [Use](class-use/HumanResourceDept.md)
  - [Tree](package-tree.md)
  - [Deprecated](../../../../deprecated-list.md)
  - [Index](../../../../index-all.md)
  - [Help](../../../../help-doc.md)

<!-- end list -->

  - [Prev Class](../../../../net/swindle/springdemo/domain/Department.md "interface in net.swindle.springdemo.domain")
  - [Next Class](../../../../net/swindle/springdemo/domain/Organization.md "class in net.swindle.springdemo.domain")

<!-- end list -->

  - [Frames](../../../../index.md?net/swindle/springdemo/domain/HumanResourceDept.md)
  - [No Frames](HumanResourceDept.md)

<!-- end list -->

  - [All Classes](../../../../allclasses-noframe.md)

<!-- end list -->

  - Summary: 
  - Nested | 
  - Field | 
  - [Constr](#constructor.summary) | 
  - [Method](#method.summary)

<!-- end list -->

  - Detail: 
  - Field | 
  - [Constr](#constructor.detail) | 
  - [Method](#method.detail)

net.swindle.springdemo.domain

## Class HumanResourceDept

  - [java.lang.Object](http://docs.oracle.com/javase/8/docs/api/java/lang/Object.md?is-external=true "class or interface in java.lang")

  -   - net.swindle.springdemo.domain.HumanResourceDept

<!-- end list -->

  -   - All Implemented
        Interfaces:  
        [Department](../../../../net/swindle/springdemo/domain/Department.md "interface in net.swindle.springdemo.domain")
    
    -----
    
      
    
        public class HumanResourceDept
        extends Object
        implements Department
    
    Implementation of
        Department
    
      - Author:  
        swindle

<!-- end list -->

  -   - 
        
        ### Constructor Summary
        
        | Constructor and Description                                                                            |
        | ------------------------------------------------------------------------------------------------------ |
        | `HumanResourceDept(RecruitmentService recruitmentService,                  Organization organization)` |
        

        Constructors 
    
    <!-- end list -->
    
      - 
        
        ### Method Summary
        
        | Modifier and Type | Method and Description                   |
        | ----------------- | ---------------------------------------- |
        | `String`          | `hiringStatus(int numberOfRecruitments)` |
        | `void`            | `setDeptName(String deptName)`           |
        

        All Methods [Instance Methods](javascript:show\(2\);) [Concrete
        Methods](javascript:show\(8\);) 
        
          - 
            
            ### Methods inherited from class java.lang.[Object](http://docs.oracle.com/javase/8/docs/api/java/lang/Object.md?is-external=true "class or interface in java.lang")
            
            `clone, equals, finalize, getClass, hashCode, notify,
            notifyAll, toString, wait, wait,
                wait`

<!-- end list -->

  -   - 
        
        ### Constructor Detail
        
          - #### HumanResourceDept
            
                public HumanResourceDept(RecruitmentService recruitmentService,
                                         Organization organization)
            
              - Parameters:  
                `recruitmentService` - A company that links potential
                employees to businesses for hire.
                `organization` -
    
    <!-- end list -->
    
      - 
        
        ### Method Detail
        
          - #### setDeptName
            
                public void setDeptName(String deptName)
            
              - Parameters:  
                `deptName` -
        
          - #### hiringStatus
            
                public String hiringStatus(int numberOfRecruitments)
            
            Specified by:
            
            `hiringStatus` in interface `Department`
            
            Returns:

[Skip navigation
    links](#skip.navbar.bottom "Skip navigation links")

  - [Overview](../../../../overview-summary.md)
  - [Package](package-summary.md)
  - Class
  - [Use](class-use/HumanResourceDept.md)
  - [Tree](package-tree.md)
  - [Deprecated](../../../../deprecated-list.md)
  - [Index](../../../../index-all.md)
  - [Help](../../../../help-doc.md)

<!-- end list -->

  - [Prev Class](../../../../net/swindle/springdemo/domain/Department.md "interface in net.swindle.springdemo.domain")
  - [Next Class](../../../../net/swindle/springdemo/domain/Organization.md "class in net.swindle.springdemo.domain")

<!-- end list -->

  - [Frames](../../../../index.md?net/swindle/springdemo/domain/HumanResourceDept.md)
  - [No Frames](HumanResourceDept.md)

<!-- end list -->

  - [All Classes](../../../../allclasses-noframe.md)

<!-- end list -->

  - Summary: 
  - Nested | 
  - Field | 
  - [Constr](#constructor.summary) | 
  - [Method](#method.summary)

<!-- end list -->

  - Detail: 
  - Field | 
  - [Constr](#constructor.detail) | 
  - [Method](#method.detail)

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
