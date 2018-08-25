# The Plugins for Year-End Closing

is used at the end of the financial year to clear all revenue and expense accounts, creates a GL Journal Batch with GL Journals for every account with a balance.

After completing the Journal Batch the balance of all revenue/expenses accounts is zero, the transferred amount corresponds to the retained earnings.

The Retained Earning account is selected as a parameter.

## How install the plugins


1.- Install SBT folollowing this steps https://www.scala-sbt.org/1.0/docs/Setup.html

2.- Modify the val sourceAdempiere = "/Users/e-Evolution/Develop/ADempiere/391" into build.sbt and replace for ADempiere Core

3.- Execute sbt compile

4.- Execute sbt assembly

5.- Copy the from target/scala-2.12/PluginsYearEndClosing.jar to $ADEMPIERE_HOME/pacakages

6.- Apply XML Script to ADempiere Application Dictionary the migration/03670_1554_Year-end_Closing.xml

7.- Finallity execute $ADEMPIERE_HOME/RUN_silentsetup.sh

## Considerations

This plugin is not compatible with the perpetual accounting of ADempiere, when generating a Journal to close the revenue and expenses accounts, So the  Financial Reporting will calculate incorrect values for reports columns defined as Year to Date given that the accounts were settled.

In order to affect the revenue and expense accounts, The functionality for accounts with flag Document Controlled are ignored allows Journal movements

So use at under own risk.