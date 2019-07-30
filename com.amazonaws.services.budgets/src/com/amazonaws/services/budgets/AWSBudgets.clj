(ns com.amazonaws.services.budgets.AWSBudgets
  "Interface for accessing AWSBudgets.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSBudgets instead.



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
  (:import [com.amazonaws.services.budgets AWSBudgets]))

(defn update-budget
  "Updates a budget. You can change every part of a budget except for the budgetName and the
   calculatedSpend. When you modify a budget, the calculatedSpend drops to zero until AWS
   has new usage data to use for forecasting.



   Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one
   time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit
   syntax. For PlannedBudgetLimits, see the Examples section.

  update-budget-request - Request of UpdateBudget - `com.amazonaws.services.budgets.model.UpdateBudgetRequest`

  returns: Result of the UpdateBudget operation returned by the service. - `com.amazonaws.services.budgets.model.UpdateBudgetResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.UpdateBudgetResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.UpdateBudgetRequest update-budget-request]
    (-> this (.updateBudget update-budget-request))))

(defn create-subscriber
  "Creates a subscriber. You must create the associated budget and notification before you create the subscriber.

  create-subscriber-request - Request of CreateSubscriber - `com.amazonaws.services.budgets.model.CreateSubscriberRequest`

  returns: Result of the CreateSubscriber operation returned by the service. - `com.amazonaws.services.budgets.model.CreateSubscriberResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.CreateSubscriberResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.CreateSubscriberRequest create-subscriber-request]
    (-> this (.createSubscriber create-subscriber-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSBudgets this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-subscribers-for-notification
  "Lists the subscribers that are associated with a notification.

  describe-subscribers-for-notification-request - Request of DescribeSubscribersForNotification - `com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest`

  returns: Result of the DescribeSubscribersForNotification operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest describe-subscribers-for-notification-request]
    (-> this (.describeSubscribersForNotification describe-subscribers-for-notification-request))))

(defn create-notification
  "Creates a notification. You must create the budget before you create the associated notification.

  create-notification-request - Request of CreateNotification - `com.amazonaws.services.budgets.model.CreateNotificationRequest`

  returns: Result of the CreateNotification operation returned by the service. - `com.amazonaws.services.budgets.model.CreateNotificationResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.CreateNotificationResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.CreateNotificationRequest create-notification-request]
    (-> this (.createNotification create-notification-request))))

(defn describe-budget-performance-history
  "Describes the history for DAILY, MONTHLY, and QUARTERLY budgets. Budget
   history isn't available for ANNUAL budgets.

  describe-budget-performance-history-request - `com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest`

  returns: Result of the DescribeBudgetPerformanceHistory operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest describe-budget-performance-history-request]
    (-> this (.describeBudgetPerformanceHistory describe-budget-performance-history-request))))

(defn describe-budget
  "Describes a budget.



   The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see
   the Examples section.

  describe-budget-request - Request of DescribeBudget - `com.amazonaws.services.budgets.model.DescribeBudgetRequest`

  returns: Result of the DescribeBudget operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeBudgetResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DescribeBudgetResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.DescribeBudgetRequest describe-budget-request]
    (-> this (.describeBudget describe-budget-request))))

(defn describe-budgets
  "Lists the budgets that are associated with an account.



   The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see
   the Examples section.

  describe-budgets-request - Request of DescribeBudgets - `com.amazonaws.services.budgets.model.DescribeBudgetsRequest`

  returns: Result of the DescribeBudgets operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeBudgetsResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DescribeBudgetsResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.DescribeBudgetsRequest describe-budgets-request]
    (-> this (.describeBudgets describe-budgets-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSBudgets this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"budgets.amazonaws.com\") or a full URL, including the protocol (ex: \"budgets.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSBudgets this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-subscriber
  "Updates a subscriber.

  update-subscriber-request - Request of UpdateSubscriber - `com.amazonaws.services.budgets.model.UpdateSubscriberRequest`

  returns: Result of the UpdateSubscriber operation returned by the service. - `com.amazonaws.services.budgets.model.UpdateSubscriberResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.UpdateSubscriberResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.UpdateSubscriberRequest update-subscriber-request]
    (-> this (.updateSubscriber update-subscriber-request))))

(defn update-notification
  "Updates a notification.

  update-notification-request - Request of UpdateNotification - `com.amazonaws.services.budgets.model.UpdateNotificationRequest`

  returns: Result of the UpdateNotification operation returned by the service. - `com.amazonaws.services.budgets.model.UpdateNotificationResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.UpdateNotificationResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.UpdateNotificationRequest update-notification-request]
    (-> this (.updateNotification update-notification-request))))

(defn delete-budget
  "Deletes a budget. You can delete your budget at any time.



   Deleting a budget also deletes the notifications and subscribers that are associated with that budget.

  delete-budget-request - Request of DeleteBudget - `com.amazonaws.services.budgets.model.DeleteBudgetRequest`

  returns: Result of the DeleteBudget operation returned by the service. - `com.amazonaws.services.budgets.model.DeleteBudgetResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DeleteBudgetResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.DeleteBudgetRequest delete-budget-request]
    (-> this (.deleteBudget delete-budget-request))))

(defn delete-notification
  "Deletes a notification.



   Deleting a notification also deletes the subscribers that are associated with the notification.

  delete-notification-request - Request of DeleteNotification - `com.amazonaws.services.budgets.model.DeleteNotificationRequest`

  returns: Result of the DeleteNotification operation returned by the service. - `com.amazonaws.services.budgets.model.DeleteNotificationResult`

  throws: com.amazonaws.services.budgets.model.InvalidParameterException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.budgets.model.DeleteNotificationResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.DeleteNotificationRequest delete-notification-request]
    (-> this (.deleteNotification delete-notification-request))))

(defn delete-subscriber
  "Deletes a subscriber.



   Deleting the last subscriber to a notification also deletes the notification.

  delete-subscriber-request - Request of DeleteSubscriber - `com.amazonaws.services.budgets.model.DeleteSubscriberRequest`

  returns: Result of the DeleteSubscriber operation returned by the service. - `com.amazonaws.services.budgets.model.DeleteSubscriberResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DeleteSubscriberResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.DeleteSubscriberRequest delete-subscriber-request]
    (-> this (.deleteSubscriber delete-subscriber-request))))

(defn describe-notifications-for-budget
  "Lists the notifications that are associated with a budget.

  describe-notifications-for-budget-request - Request of DescribeNotificationsForBudget - `com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest`

  returns: Result of the DescribeNotificationsForBudget operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult`

  throws: com.amazonaws.services.budgets.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest describe-notifications-for-budget-request]
    (-> this (.describeNotificationsForBudget describe-notifications-for-budget-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSBudgets this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-budget
  "Creates a budget and, if included, notifications and subscribers.



   Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one
   time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit
   syntax. For PlannedBudgetLimits, see the Examples section.

  create-budget-request - Request of CreateBudget - `com.amazonaws.services.budgets.model.CreateBudgetRequest`

  returns: Result of the CreateBudget operation returned by the service. - `com.amazonaws.services.budgets.model.CreateBudgetResult`

  throws: com.amazonaws.services.budgets.model.InvalidParameterException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.budgets.model.CreateBudgetResult [^AWSBudgets this ^com.amazonaws.services.budgets.model.CreateBudgetRequest create-budget-request]
    (-> this (.createBudget create-budget-request))))

