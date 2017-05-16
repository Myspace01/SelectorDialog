# SelectorDialog Explain：

Step 1. Add the JitPack repository to your build file

      Add it in your root build.gradle at the end of repositories:
     
     	allprojects {
		      repositories {
			          ...
			          maven { url 'https://jitpack.io' }
		      }
	    }
      
Step 2. Add the dependency

      	dependencies {
	        compile 'com.github.Myspace01:SelectorDialog:v1.0.0'
	      }
        
        
        
 Step 3. Construction Method
 
      ActionSheet.createBuilder(this, getSupportFragmentManager())
                .setCancelButtonTitle("isCancle")
                .setOtherButtonTitles("Item1", "Item2","Item3","Item4",. . .)
                .setCancelableOnTouchOutside(true).setListener(this).show();
                
Step 4. Monitor click event callback

      implements SelectorDialog.SelectorDialogListener
      
Step 5. Overwrite callback method   

      @Override
    public void onOtherButtonClick(SelectorDialog actionSheet, int index)
    {
        switch (index)
        {
            case 0://Item1
                
                break;
            case 1://Item2
                
                break;
            case 2://Item3
                
                break;
            case 3://Item4
                
                break;
                
                .
                .
                .
        }
        
        Toast.makeText(this,"click:"+index,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDismiss(SelectorDialog actionSheet, boolean isCancle)
    {
        //isCancle     isCancle=true;
        
    }
      
      
