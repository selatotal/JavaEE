/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.CategoryFacade;

/**
 *
 * @author talesviegas
 */
@WebServlet(name = "ControllerServlet", 
        loadOnStartup = 1,
        urlPatterns = {
            "/category", 
            "/addToCart", 
            "/viewCart",
            "/updateCart",
            "/checkout",
            "/purchase",
            "/chooseLanguage"
        })
public class ControllerServlet extends HttpServlet {

    @EJB
    private CategoryFacade categoryFacade;

    @Override
    public void init() throws ServletException{
        
        // Store category list in servlet context
        getServletContext().setAttribute("categories", this.categoryFacade.findAll());
    }
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userPath = request.getServletPath();
        
     
        if (userPath.equals("/category")){  // if category page is requested
            // TODO: Implement category request
        } else if (userPath.equals("/viewCart")){ // if cart page is requested
            // TODO: Implement cart request
            userPath = "/cart";
        } else if (userPath.equals("/checkout")){ // if checkout page is requested
            // TODO: Implement checkout page request
        } else if (userPath.equals("/changeLanguage")){ // if user switches language
            // TODO: Implement language request
        }
        
        // User request dispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";
        
        request.getRequestDispatcher(url).forward(request, response);
                
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String userPath = request.getServletPath();
        
        if (userPath.equals("/addToCart")){ // if add to cart action is called
            // TODO: Implement add product to cart action
        } else if (userPath.equals("/updateCart")){ // if update cart is called
            // TODO: Implement update cart action            
        } else if (userPath.equals("/purchase")){ // if purchase action is called
            // TODO: Implement purchase action
            userPath = "/confirmation";
        }
        
        // Use request dispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";
        
        request.getRequestDispatcher(url).forward(request, response);
                
    }


}
