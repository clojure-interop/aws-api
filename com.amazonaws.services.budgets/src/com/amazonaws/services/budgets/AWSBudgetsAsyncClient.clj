(ns com.amazonaws.services.budgets.AWSBudgetsAsyncClient
  "Client for accessing AWSBudgets asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


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
  (:import [com.amazonaws.services.budgets AWSBudgetsAsyncClient]))

(defn ->aws-budgets-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSBudgetsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSBudgetsAsyncClient aws-credentials client-configuration executor-service))
  (^AWSBudgetsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSBudgetsAsyncClient aws-credentials executor-service))
  (^AWSBudgetsAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSBudgetsAsyncClient client-configuration))
  (^AWSBudgetsAsyncClient []
    (new AWSBudgetsAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.budgets.AWSBudgetsAsyncClientBuilder`"
  (^com.amazonaws.services.budgets.AWSBudgetsAsyncClientBuilder []
    (AWSBudgetsAsyncClient/asyncBuilder )))

(defn delete-subscriber-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DeleteSubscriber - `com.amazonaws.services.budgets.model.DeleteSubscriberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubscriber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DeleteSubscriberResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DeleteSubscriberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubscriberAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DeleteSubscriberRequest request]
    (-> this (.deleteSubscriberAsync request))))

(defn update-budget-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of UpdateBudget - `com.amazonaws.services.budgets.model.UpdateBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.UpdateBudgetResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.UpdateBudgetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBudgetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.UpdateBudgetRequest request]
    (-> this (.updateBudgetAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSBudgetsAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-budget-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DeleteBudget - `com.amazonaws.services.budgets.model.DeleteBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DeleteBudgetResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DeleteBudgetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBudgetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DeleteBudgetRequest request]
    (-> this (.deleteBudgetAsync request))))

(defn describe-budget-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DescribeBudget - `com.amazonaws.services.budgets.model.DescribeBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeBudgetResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DescribeBudgetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBudgetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DescribeBudgetRequest request]
    (-> this (.describeBudgetAsync request))))

(defn delete-notification-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DeleteNotification - `com.amazonaws.services.budgets.model.DeleteNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotification operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DeleteNotificationResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DeleteNotificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DeleteNotificationRequest request]
    (-> this (.deleteNotificationAsync request))))

(defn create-budget-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of CreateBudget - `com.amazonaws.services.budgets.model.CreateBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.CreateBudgetResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.CreateBudgetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBudgetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.CreateBudgetRequest request]
    (-> this (.createBudgetAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSBudgetsAsyncClient this]
    (-> this (.shutdown))))

(defn create-subscriber-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of CreateSubscriber - `com.amazonaws.services.budgets.model.CreateSubscriberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubscriber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.CreateSubscriberResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.CreateSubscriberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubscriberAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.CreateSubscriberRequest request]
    (-> this (.createSubscriberAsync request))))

(defn update-subscriber-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of UpdateSubscriber - `com.amazonaws.services.budgets.model.UpdateSubscriberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSubscriber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.UpdateSubscriberResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.UpdateSubscriberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSubscriberAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.UpdateSubscriberRequest request]
    (-> this (.updateSubscriberAsync request))))

(defn describe-budgets-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DescribeBudgets - `com.amazonaws.services.budgets.model.DescribeBudgetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBudgets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeBudgetsResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DescribeBudgetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBudgetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DescribeBudgetsRequest request]
    (-> this (.describeBudgetsAsync request))))

(defn create-notification-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of CreateNotification - `com.amazonaws.services.budgets.model.CreateNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNotification operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.CreateNotificationResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.CreateNotificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNotificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.CreateNotificationRequest request]
    (-> this (.createNotificationAsync request))))

(defn describe-budget-performance-history-async
  "Description copied from interface: AWSBudgetsAsync

  request - `com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBudgetPerformanceHistory operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBudgetPerformanceHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest request]
    (-> this (.describeBudgetPerformanceHistoryAsync request))))

(defn update-notification-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of UpdateNotification - `com.amazonaws.services.budgets.model.UpdateNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNotification operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.UpdateNotificationResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.UpdateNotificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNotificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.UpdateNotificationRequest request]
    (-> this (.updateNotificationAsync request))))

(defn describe-subscribers-for-notification-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DescribeSubscribersForNotification - `com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubscribersForNotification operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubscribersForNotificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest request]
    (-> this (.describeSubscribersForNotificationAsync request))))

(defn describe-notifications-for-budget-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DescribeNotificationsForBudget - `com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNotificationsForBudget operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult>`"
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNotificationsForBudgetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBudgetsAsyncClient this ^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest request]
    (-> this (.describeNotificationsForBudgetAsync request))))

