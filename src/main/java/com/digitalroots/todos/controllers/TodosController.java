package com.digitalroots.todos.controllers;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todos")
public class TodosController
{

    /**
     *
     * @return all of the TODOs
     * @throws IOException
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody
    Map getAll() throws IOException
    {
        Map<String, Object> result = new LinkedHashMap<String, Object>();

        // TODO

        result.put("data", CollectionUtils.EMPTY_COLLECTION);
        return result;
    }

    @RequestMapping(value = "{id}/remove", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable("id") String id) throws IOException
    {
        // TODO
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody
    Map create(BindingResult bindingResult, HttpServletResponse response) throws
            BindException, IOException
    {
        if (bindingResult.hasErrors())
        {
            throw new BindException(bindingResult);
        }

        Map<String, Object> result = new LinkedHashMap<String, Object>();

        // TODO

        result.put("data", null);
        return result;
    }
}
