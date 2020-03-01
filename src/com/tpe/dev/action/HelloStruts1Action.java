package com.tpe.dev.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dev.tpe.form.HelloStruts1Form;

public class HelloStruts1Action extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		HelloStruts1Form hwForm = (HelloStruts1Form) form;
	    hwForm.setMessage("Hello World");
	    return mapping.findForward("success");
	    }

}
