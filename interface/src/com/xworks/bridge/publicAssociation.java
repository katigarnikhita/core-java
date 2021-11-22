package com.xworks.bridge;

public class publicAssociation implements DevoteRule {
 


@Override
public boolean SlipperOff() {
	System.out.println("invoking slipper");
	return true;
}

@Override
public boolean dontTakePhoto() {
	System.out.println("dont take photos");
	return false;
}

@Override
public boolean maintaneslilence() {
	System.out.println("invoking slinece");
	return false;
}

}
