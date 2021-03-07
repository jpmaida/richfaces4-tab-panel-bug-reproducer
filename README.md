# Richfaces4 Tab Panel Bug Reproducer repo

The main goal of this repository is to document, reproduce and provide a possible solution about the `<rich:tabPanel>` component bug.

## What happens ?

If your application was built using `<ui:insert> + <ui:composition>` technique, which is very commom in JSF + Richfaces applications, you will face the problem explained below:

Page A opens page B via an Ajax call. Page B has a `<rich:tabPanel>` component.

## Possible solution

disable resourceOptimization in web.xml
