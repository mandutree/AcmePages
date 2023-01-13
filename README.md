# AcmePages
This package contains page and component objects that represents the demo [ACME website](https://demo.applitools.com).
This website only contains 2 pages.  Login and Home.  The data provided on this website is fake and static.

The purpose of this package is to show how [ElementHandler](https://github.com/mandutree/ElementHandler) can be used
to create **page** and **component** objects.  See README.md file on the [ElementHandler](https://github.com/mandutree/ElementHandler)
package for additional details.

## Catalog
Catalog is an entry point which can be used to access any objects and their functionalities on any page.  It is
analogous to a phone book.  Like a good phone book, the pages and objects are organized into logical order.

The [Home page](https://demo.applitools.com/app.html) of ACME website contains several stock and company information in
a table.  Let's say we are looking to get the trade status for Starbucks.  In order to get this data, we first need
to know the page that holds this information.  In this case, that is the Home page.  Then we can narrow down the search
by looking at the Recent Transaction table.  In that table we are interested on the row with description Starbucks
coffee. Then finally, we want to get the status of that row.  The catalog supports this exact way of thinking.

    catalog.homePage().recentTransactions().grid().rowByDescription("Starbucks coffee").status();

In this way, anyone with familiarity of the website can look at this code and understand exactly what it is doing.
Furthermore, any modern day IDE contains IntelliSense that will help you identify the available options in an object.
eg. By by entering "." after the ***grid().***, the IntelliSense will indicate that there are 2 ways to identify the
row. By index or description.  In this way, creating tests can become easier.

See [AcmeTests](https://github.com/mandutree/AcmeTests) package for example tests.

## Client Agnostic
Often times, the UI is very similar between various clients.  eg, a Home page on a browser may look very similar to an
Android or an iOS version of the application.  In this case, you can create an interface of the Home page and have 3
different implementations.  One for each client.  During the initial construction of the catalog, you can specify the
client and construct the appropriate page for that client.  This information can trickle down to the components, so that
we create the client specific components as well.

That is what this package attempts to do.  Because this application currently exists only on a browser, there is only
one implementation of the pages and components.  In the future, when this application becomes available on multiple
clients, the code can be extended without altering the existing logic of the browser implementation.  This ensures that
existing browser tests will not be affected by the introduction of the new client.
