package com.cms;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class CmsExceptions extends Exception {
	public CmsExceptions(String msg) {
		super(msg);
	}
}
