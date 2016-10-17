# Fibonnacci Number Project

This is a small project aimed at learning code optimisation with different languages. The aim is not to make it looking at resources on the web but rather by myself. 

## Resources

Verify up to the [300 first numbers](http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html)
Calculate any [Fibonnaci number](http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibCalcX.html)

## Java

* Fibo1 goes up to 92 in 353888ns then crashes.
* Fibo2 goes up to 280k in 3'974'990'686ns it crashes around 285k
* Fibo3 for index:
	* 500			  994'695ns
	* 280k  	1'475'684'875ns 
	* 500k      3'831'964'741ns 
	* 1M       13'526'871'912ns (13s)
	* 2M       57'516'943'084ns (57s)
	* 10M   1'450'392'247'438ns (24min)
* Fibo4 for index:
	* 50 			  598'077ns
	* 500 		   	  963'891ns
	* 280k      1'334'916'395ns
	* 500k 		3'641'665'602ns
	* 1M       13'868'708'707ns
	* 2M 	   56'301'629'099ns
	* 10M 	15'33'019'292'114ns (25min)

## Php

* Fibo1 breaks after 1475... ~220ns, seems quite fast though.

## Python
* Fibo1	
	* 50			    6'297ns
	* 500			   56'316ns
	* 280K 		  799'821'694ns (0.8s)
	* 500k 	    2'529'512'793ns (2.5s)
	* 1M        9'766'691'625ns (9.8s)
	* 2M 	   40'553'022'295ns (40.5s)
	* 10M	1'019'491'969'834ns	(17min)
