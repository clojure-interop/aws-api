(ns com.amazonaws.services.budgets.AWSBudgetsClient
  "Client for accessing AWSBudgets. All service calls made using this client are blocking, and will not return until the
  service call completes.


  The AWS Budgets API enables you to use AWS Budgets to plan your service usage, service costs, and instance
  reservations. The API reference provides descriptions, syntax, and usage examples for each of the actions and data
  types for AWS Budgets.


  Budgets provide you with a way to see the following information:




  How close your plan is to your budgeted amount or to the free tier limits




  Your usage-to-date, including how much you've used of your Reserved Instances (RIs)




  Your current estimated charges from AWS, and how much your predicted usage will accrue in charges by the end of the
  month




  How much of your budget has been used




  AWS updates your budget status several times a day. Budgets track your unblended costs, subscriptions, refunds, and
  RIs. You can create the following types of budgets:




  Cost budgets - Plan how much you want to spend on a service.




  Usage budgets - Plan how much you want to use one or more services.




  RI utilization budgets - Define a utilization threshold, and receive alerts when your RI usage falls below
  that threshold. This lets you see if your RIs are unused or under-utilized.




  RI coverage budgets - Define a coverage threshold, and receive alerts when the number of your instance hours
  that are covered by RIs fall below that threshold. This lets you see how much of your instance usage is covered by a
  reservation.




  Service Endpoint


  The AWS Budgets API provides the following endpoint:




  https://budgets.amazonaws.com




  For information about costs that are associated with the AWS Budgets API, see AWS Cost Management Pricing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.budgets AWSBudgetsClient]))

(defn ->aws-budgets-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWSBudgets (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSBudgetsClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSBudgetsClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSBudgetsClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSBudgetsClient aws-credentials client-configuration))
  (^AWSBudgetsClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSBudgetsClient client-configuration))
  (^AWSBudgetsClient []
    (new AWSBudgetsClient )))

(defn *builder
  "returns: `com.amazonaws.services.budgets.AWSBudgetsClientBuilder`"
  (^com.amazonaws.services.budgets.AWSBudgetsClientBuilder []
    (AWSBudgetsClient/builder )))

(defn update-budget
  "Updates a budget. You can change every part of a budget except for the budgetName and the
   calculatedSpend. When you modify a budget, the calculatedSpend drops to zero until AWS
   has new usage data to use for forecasting.



   Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one
   time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit
   syntax. For PlannedBudgetLimits, see the Examples section.

  request - `com.amazonaws.services.budgets.model.UpdateBudgetRequest`

  returns: Result of the UpdateBudget operation returned by the service. - `com.amazonaws.services.budgets.model.UpdateBudgetResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.UpdateBudgetResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.UpdateBudgetRequest request]
    (-> this (.updateBudget request))))

(defn create-subscriber
  "Creates a subscriber. You must create the associated budget and notification before you create the subscriber.

  request - `com.amazonaws.services.budgets.model.CreateSubscriberRequest`

  returns: Result of the CreateSubscriber operation returned by the service. - `com.amazonaws.services.budgets.model.CreateSubscriberResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.CreateSubscriberResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.CreateSubscriberRequest request]
    (-> this (.createSubscriber request))))

(defn describe-subscribers-for-notification
  "Lists the subscribers that are associated with a notification.

  request - `com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest`

  returns: Result of the DescribeSubscribersForNotification operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest request]
    (-> this (.describeSubscribersForNotification request))))

(defn create-notification
  "Creates a notification. You must create the budget before you create the associated notification.

  request - `com.amazonaws.services.budgets.model.CreateNotificationRequest`

  returns: Result of the CreateNotification operation returned by the service. - `com.amazonaws.services.budgets.model.CreateNotificationResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.CreateNotificationResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.CreateNotificationRequest request]
    (-> this (.createNotification request))))

(defn describe-budget-performance-history
  "Describes the history for DAILY, MONTHLY, and QUARTERLY budgets. Budget
   history isn't available for ANNUAL budgets.

  request - `com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest`

  returns: Result of the DescribeBudgetPerformanceHistory operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest request]
    (-> this (.describeBudgetPerformanceHistory request))))

(defn describe-budget
  "Describes a budget.



   The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see
   the Examples section.

  request - `com.amazonaws.services.budgets.model.DescribeBudgetRequest`

  returns: Result of the DescribeBudget operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeBudgetResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DescribeBudgetResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.DescribeBudgetRequest request]
    (-> this (.describeBudget request))))

(defn describe-budgets
  "Lists the budgets that are associated with an account.



   The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see
   the Examples section.

  request - `com.amazonaws.services.budgets.model.DescribeBudgetsRequest`

  returns: Result of the DescribeBudgets operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeBudgetsResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DescribeBudgetsResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.DescribeBudgetsRequest request]
    (-> this (.describeBudgets request))))

(defn update-subscriber
  "Updates a subscriber.

  request - `com.amazonaws.services.budgets.model.UpdateSubscriberRequest`

  returns: Result of the UpdateSubscriber operation returned by the service. - `com.amazonaws.services.budgets.model.UpdateSubscriberResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.UpdateSubscriberResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.UpdateSubscriberRequest request]
    (-> this (.updateSubscriber request))))

(defn update-notification
  "Updates a notification.

  request - `com.amazonaws.services.budgets.model.UpdateNotificationRequest`

  returns: Result of the UpdateNotification operation returned by the service. - `com.amazonaws.services.budgets.model.UpdateNotificationResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.UpdateNotificationResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.UpdateNotificationRequest request]
    (-> this (.updateNotification request))))

(defn delete-budget
  "Deletes a budget. You can delete your budget at any time.



   Deleting a budget also deletes the notifications and subscribers that are associated with that budget.

  request - `com.amazonaws.services.budgets.model.DeleteBudgetRequest`

  returns: Result of the DeleteBudget operation returned by the service. - `com.amazonaws.services.budgets.model.DeleteBudgetResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DeleteBudgetResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.DeleteBudgetRequest request]
    (-> this (.deleteBudget request))))

(defn delete-notification
  "Deletes a notification.



   Deleting a notification also deletes the subscribers that are associated with the notification.

  request - `com.amazonaws.services.budgets.model.DeleteNotificationRequest`

  returns: Result of the DeleteNotification operation returned by the service. - `com.amazonaws.services.budgets.model.DeleteNotificationResult`

  throws: com.amazonaws.services.budgets.model.InvalidParameterException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.budgets.model.DeleteNotificationResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.DeleteNotificationRequest request]
    (-> this (.deleteNotification request))))

(defn delete-subscriber
  "Deletes a subscriber.



   Deleting the last subscriber to a notification also deletes the notification.

  request - `com.amazonaws.services.budgets.model.DeleteSubscriberRequest`

  returns: Result of the DeleteSubscriber operation returned by the service. - `com.amazonaws.services.budgets.model.DeleteSubscriberResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DeleteSubscriberResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.DeleteSubscriberRequest request]
    (-> this (.deleteSubscriber request))))

(defn describe-notifications-for-budget
  "Lists the notifications that are associated with a budget.

  request - `com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest`

  returns: Result of the DescribeNotificationsForBudget operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest request]
    (-> this (.describeNotificationsForBudget request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSBudgetsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-budget
  "Creates a budget and, if included, notifications and subscribers.



   Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one
   time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit
   syntax. For PlannedBudgetLimits, see the Examples section.

  request - `com.amazonaws.services.budgets.model.CreateBudgetRequest`

  returns: Result of the CreateBudget operation returned by the service. - `com.amazonaws.services.budgets.model.CreateBudgetResult`

  throws: com.amazonaws.services.budgets.model.InvalidParameterException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.budgets.model.CreateBudgetResult [^AWSBudgetsClient this ^com.amazonaws.services.budgets.model.CreateBudgetRequest request]
    (-> this (.createBudget request))))

