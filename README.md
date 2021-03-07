# Richfaces4 Tab Panel Bug Reproducer repo

The main goal of this repository is to document, reproduce and provide a possible solution about the `<rich:tabPanel>` component bug.

## What happens ?

If your application was built using `<ui:insert> + <ui:composition>` technique, which is very commom in JSF + Richfaces applications, you will face the problem explained below:

<img width="608" alt="Screen Shot 2021-03-07 at 17 07 18" src="https://user-images.githubusercontent.com/7494680/110253173-a023ec80-7f67-11eb-801d-89453c469581.png">

Page A opens page B via an Ajax call. Page B has a `<rich:tabPanel>` component.

<img width="587" alt="Screen Shot 2021-03-07 at 17 08 14" src="https://user-images.githubusercontent.com/7494680/110253213-da8d8980-7f67-11eb-80aa-4f07e7fc7b76.png">

Bug happens when selecting multiples tabs !!!

<img width="690" alt="Screen Shot 2021-03-07 at 17 10 22" src="https://user-images.githubusercontent.com/7494680/110253247-07da3780-7f68-11eb-83af-a5111e886094.png">

Bug don't happen when you open page B using an non-Ajax call.

<img width="643" alt="Screen Shot 2021-03-07 at 17 11 48" src="https://user-images.githubusercontent.com/7494680/110253293-4a037900-7f68-11eb-8920-6f714962aa03.png">

<img width="714" alt="Screen Shot 2021-03-07 at 17 12 44" src="https://user-images.githubusercontent.com/7494680/110253326-80d98f00-7f68-11eb-9921-604f7dfd5d1e.png">

## Possible solution

Two possible solutions for this case:
1. Change all buttons/hyperlinks that use Ajax calls to open pages to components that use tradicional HTTP request.
2. Change the context-param `org.richfaces.resourceOptimization.enabled` from `true` to `false`.
