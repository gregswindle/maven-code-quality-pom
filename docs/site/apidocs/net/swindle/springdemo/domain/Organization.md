JavaScript is disabled on your browser.

[Skip navigation
    links](#skip.navbar.top "Skip navigation links")

  - [Overview](../../../../overview-summary.md)
  - [Package](package-summary.md)
  - Class
  - [Use](class-use/Organization.md)
  - [Tree](package-tree.md)
  - [Deprecated](../../../../deprecated-list.md)
  - [Index](../../../../index-all.md)
  - [Help](../../../../help-doc.md)

<!-- end list -->

  - [Prev Class](../../../../net/swindle/springdemo/domain/HumanResourceDept.md "class in net.swindle.springdemo.domain")
  - Next Class

<!-- end list -->

  - [Frames](../../../../index.md?net/swindle/springdemo/domain/Organization.md)
  - [No Frames](Organization.md)

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

## Class Organization

  - [java.lang.Object](http://docs.oracle.com/javase/8/docs/api/java/lang/Object.md?is-external=true "class or interface in java.lang")

  -   - net.swindle.springdemo.domain.Organization

<!-- end list -->

  - 
    
    -----
    
      
    
        public class Organization
        extends Object
    
    Organizations.
    
      - Author:  
        swindle

<!-- end list -->

  -   - 
        
        ### Constructor Summary
        
        <table>
        <caption><span>Constructors</span><span class="tabEnd"> </span></caption>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Constructor and Description</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><code>Organization(String companyName)</code>
        <div class="block">
        Constructor method.
        </div></td>
        </tr>
        </tbody>
        </table>
    
    <!-- end list -->
    
      - 
        
        ### Method Summary
        
        <table>
        <caption><span id="t0" class="activeTableTab"><span>All Methods</span><span class="tabEnd"> </span></span><span id="t2" class="tableTab"><span><a href="javascript:show(2);">Instance Methods</a></span><span class="tabEnd"> </span></span><span id="t4" class="tableTab"><span><a href="javascript:show(8);">Concrete Methods</a></span><span class="tabEnd"> </span></span></caption>
        <colgroup>
        <col style="width: 50%" />
        <col style="width: 50%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Modifier and Type</th>
        <th>Method and Description</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><code>String</code></td>
        <td><code>corporateService()</code>
        <div class="block">
        Announce services provided.
        </div></td>
        </tr>
        <tr class="even">
        <td><code>String</code></td>
        <td><code>corporateSlogan()</code>
        <div class="block">
        Announce the company's slogan.
        </div></td>
        </tr>
        <tr class="odd">
        <td><code>String</code></td>
        <td><code>getCompanyName()</code>
        <div class="block">
        Access company name.
        </div></td>
        </tr>
        <tr class="even">
        <td><code>void</code></td>
        <td><code>setBusinessService(BusinessService businessService)</code>
        <div class="block">
        Provide for Spring Bean mutation.
        </div></td>
        </tr>
        <tr class="odd">
        <td><code>void</code></td>
        <td><code>setEmployeeCount(int employeeCount)</code>
        <div class="block">
        Provide for Spring Bean mutation.
        </div></td>
        </tr>
        <tr class="even">
        <td><code>void</code></td>
        <td><code>setPostalCode(String postalCode)</code>
        <div class="block">
        Provide for Spring Bean mutation.
        </div></td>
        </tr>
        <tr class="odd">
        <td><code>void</code></td>
        <td><code>setSlogan(String slogan)</code>
        <div class="block">
        Modify the company slogan.
        </div></td>
        </tr>
        </tbody>
        </table>
        
          - 
            
            ### Methods inherited from class java.lang.[Object](http://docs.oracle.com/javase/8/docs/api/java/lang/Object.md?is-external=true "class or interface in java.lang")
            
            `clone, equals, finalize, getClass, hashCode, notify,
            notifyAll, toString, wait, wait, wait`

<!-- end list -->

  -   - 
        
        ### Constructor Detail
        
          - #### Organization
            
                public Organization(String companyName)
            
            Constructor method.
            
              - Parameters:  
                `companyName` - The company name
    
    <!-- end list -->
    
      - 
        
        ### Method Detail
        
          - #### getCompanyName
            
                public String getCompanyName()
            
            Access company name.
            
              - Returns:  
                companyName The company name
        
          - #### setPostalCode
            
                @Autowired(required=false)
                public void setPostalCode(String postalCode)
            
            Provide for Spring Bean mutation.
            
              - Parameters:  
                `postalCode` - The postal/regional code.
        
          - #### setEmployeeCount
            
                @Autowired(required=false)
                public void setEmployeeCount(int employeeCount)
            
            Provide for Spring Bean mutation.
            
              - Parameters:  
                `employeeCount` - The number of people employeed in the
                company.
        
          - #### setSlogan
            
                public void setSlogan(String slogan)
            
            Modify the company slogan.
            
              - Parameters:  
                `slogan` - The company's
                slogan.
        
          - #### setBusinessService
            
                public void setBusinessService(BusinessService businessService)
            
            Provide for Spring Bean mutation.
            
              - Parameters:  
                `businessService` - Reference to outsourced
                service-provider.
        
          - #### corporateSlogan
            
                public String corporateSlogan()
            
            Announce the company's slogan.
            
              - Returns:  
                The company slogan.
        
          - #### corporateService
            
                public String corporateService()
            
            Announce services provided.
            
              - Returns:  
                Statement of services offered

[Skip navigation
    links](#skip.navbar.bottom "Skip navigation links")

  - [Overview](../../../../overview-summary.md)
  - [Package](package-summary.md)
  - Class
  - [Use](class-use/Organization.md)
  - [Tree](package-tree.md)
  - [Deprecated](../../../../deprecated-list.md)
  - [Index](../../../../index-all.md)
  - [Help](../../../../help-doc.md)

<!-- end list -->

  - [Prev Class](../../../../net/swindle/springdemo/domain/HumanResourceDept.md "class in net.swindle.springdemo.domain")
  - Next Class

<!-- end list -->

  - [Frames](../../../../index.md?net/swindle/springdemo/domain/Organization.md)
  - [No Frames](Organization.md)

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
