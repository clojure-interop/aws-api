(ns com.amazonaws.services.budgets.AWSBudgetsAsync
  "Interface for accessing AWSBudgets asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSBudgetsAsync instead.



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
  (:import [com.amazonaws.services.budgets AWSBudgetsAsync]))

(defn delete-subscriber-async
  "Deletes a subscriber.



   Deleting the last subscriber to a notification also deletes the notification.

  delete-subscriber-request - Request of DeleteSubscriber - `com.amazonaws.services.budgets.model.DeleteSubscriberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubscriber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DeleteSubscriberResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteSubscriberRequest delete-subscriber-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubscriberAsync delete-subscriber-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteSubscriberRequest delete-subscriber-request]
    (-> this (.deleteSubscriberAsync delete-subscriber-request))))

(defn update-budget-async
  "Updates a budget. You can change every part of a budget except for the budgetName and the
   calculatedSpend. When you modify a budget, the calculatedSpend drops to zero until AWS
   has new usage data to use for forecasting.



   Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one
   time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit
   syntax. For PlannedBudgetLimits, see the Examples section.

  update-budget-request - Request of UpdateBudget - `com.amazonaws.services.budgets.model.UpdateBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.UpdateBudgetResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateBudgetRequest update-budget-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBudgetAsync update-budget-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateBudgetRequest update-budget-request]
    (-> this (.updateBudgetAsync update-budget-request))))

(defn delete-budget-async
  "Deletes a budget. You can delete your budget at any time.



   Deleting a budget also deletes the notifications and subscribers that are associated with that budget.

  delete-budget-request - Request of DeleteBudget - `com.amazonaws.services.budgets.model.DeleteBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DeleteBudgetResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteBudgetRequest delete-budget-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBudgetAsync delete-budget-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteBudgetRequest delete-budget-request]
    (-> this (.deleteBudgetAsync delete-budget-request))))

(defn describe-budget-async
  "Describes a budget.



   The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see
   the Examples section.

  describe-budget-request - Request of DescribeBudget - `com.amazonaws.services.budgets.model.DescribeBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeBudgetResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetRequest describe-budget-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBudgetAsync describe-budget-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetRequest describe-budget-request]
    (-> this (.describeBudgetAsync describe-budget-request))))

(defn delete-notification-async
  "Deletes a notification.



   Deleting a notification also deletes the subscribers that are associated with the notification.

  delete-notification-request - Request of DeleteNotification - `com.amazonaws.services.budgets.model.DeleteNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotification operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DeleteNotificationResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteNotificationRequest delete-notification-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotificationAsync delete-notification-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteNotificationRequest delete-notification-request]
    (-> this (.deleteNotificationAsync delete-notification-request))))

(defn create-budget-async
  "Creates a budget and, if included, notifications and subscribers.



   Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one
   time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit
   syntax. For PlannedBudgetLimits, see the Examples section.

  create-budget-request - Request of CreateBudget - `com.amazonaws.services.budgets.model.CreateBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.CreateBudgetResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateBudgetRequest create-budget-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBudgetAsync create-budget-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateBudgetRequest create-budget-request]
    (-> this (.createBudgetAsync create-budget-request))))

(defn create-subscriber-async
  "Creates a subscriber. You must create the associated budget and notification before you create the subscriber.

  create-subscriber-request - Request of CreateSubscriber - `com.amazonaws.services.budgets.model.CreateSubscriberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubscriber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.CreateSubscriberResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateSubscriberRequest create-subscriber-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubscriberAsync create-subscriber-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateSubscriberRequest create-subscriber-request]
    (-> this (.createSubscriberAsync create-subscriber-request))))

(defn update-subscriber-async
  "Updates a subscriber.

  update-subscriber-request - Request of UpdateSubscriber - `com.amazonaws.services.budgets.model.UpdateSubscriberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSubscriber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.UpdateSubscriberResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateSubscriberRequest update-subscriber-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSubscriberAsync update-subscriber-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateSubscriberRequest update-subscriber-request]
    (-> this (.updateSubscriberAsync update-subscriber-request))))

(defn describe-budgets-async
  "Lists the budgets that are associated with an account.



   The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see
   the Examples section.

  describe-budgets-request - Request of DescribeBudgets - `com.amazonaws.services.budgets.model.DescribeBudgetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBudgets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeBudgetsResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetsRequest describe-budgets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBudgetsAsync describe-budgets-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetsRequest describe-budgets-request]
    (-> this (.describeBudgetsAsync describe-budgets-request))))

(defn create-notification-async
  "Creates a notification. You must create the budget before you create the associated notification.

  create-notification-request - Request of CreateNotification - `com.amazonaws.services.budgets.model.CreateNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNotification operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.CreateNotificationResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateNotificationRequest create-notification-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNotificationAsync create-notification-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateNotificationRequest create-notification-request]
    (-> this (.createNotificationAsync create-notification-request))))

(defn describe-budget-performance-history-async
  "Describes the history for DAILY, MONTHLY, and QUARTERLY budgets. Budget
   history isn't available for ANNUAL budgets.

  describe-budget-performance-history-request - `com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBudgetPerformanceHistory operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest describe-budget-performance-history-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBudgetPerformanceHistoryAsync describe-budget-performance-history-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest describe-budget-performance-history-request]
    (-> this (.describeBudgetPerformanceHistoryAsync describe-budget-performance-history-request))))

(defn update-notification-async
  "Updates a notification.

  update-notification-request - Request of UpdateNotification - `com.amazonaws.services.budgets.model.UpdateNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNotification operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.UpdateNotificationResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateNotificationRequest update-notification-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNotificationAsync update-notification-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateNotificationRequest update-notification-request]
    (-> this (.updateNotificationAsync update-notification-request))))

(defn describe-subscribers-for-notification-async
  "Lists the subscribers that are associated with a notification.

  describe-subscribers-for-notification-request - Request of DescribeSubscribersForNotification - `com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubscribersForNotification operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest describe-subscribers-for-notification-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubscribersForNotificationAsync describe-subscribers-for-notification-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest describe-subscribers-for-notification-request]
    (-> this (.describeSubscribersForNotificationAsync describe-subscribers-for-notification-request))))

(defn describe-notifications-for-budget-async
  "Lists the notifications that are associated with a budget.

  describe-notifications-for-budget-request - Request of DescribeNotificationsForBudget - `com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNotificationsForBudget operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest describe-notifications-for-budget-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNotificationsForBudgetAsync describe-notifications-for-budget-request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest describe-notifications-for-budget-request]
    (-> this (.describeNotificationsForBudgetAsync describe-notifications-for-budget-request))))

