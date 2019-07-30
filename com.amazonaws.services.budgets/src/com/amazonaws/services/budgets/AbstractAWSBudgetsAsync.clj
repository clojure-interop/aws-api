(ns com.amazonaws.services.budgets.AbstractAWSBudgetsAsync
  "Abstract implementation of AWSBudgetsAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.budgets AbstractAWSBudgetsAsync]))

(defn delete-subscriber-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DeleteSubscriber - `com.amazonaws.services.budgets.model.DeleteSubscriberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubscriber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DeleteSubscriberResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteSubscriberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubscriberAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteSubscriberRequest request]
    (-> this (.deleteSubscriberAsync request))))

(defn update-budget-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of UpdateBudget - `com.amazonaws.services.budgets.model.UpdateBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.UpdateBudgetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateBudgetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBudgetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateBudgetRequest request]
    (-> this (.updateBudgetAsync request))))

(defn delete-budget-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DeleteBudget - `com.amazonaws.services.budgets.model.DeleteBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DeleteBudgetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteBudgetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBudgetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteBudgetRequest request]
    (-> this (.deleteBudgetAsync request))))

(defn describe-budget-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DescribeBudget - `com.amazonaws.services.budgets.model.DescribeBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeBudgetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBudgetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetRequest request]
    (-> this (.describeBudgetAsync request))))

(defn delete-notification-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DeleteNotification - `com.amazonaws.services.budgets.model.DeleteNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotification operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DeleteNotificationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteNotificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DeleteNotificationRequest request]
    (-> this (.deleteNotificationAsync request))))

(defn create-budget-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of CreateBudget - `com.amazonaws.services.budgets.model.CreateBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBudget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.CreateBudgetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateBudgetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBudgetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateBudgetRequest request]
    (-> this (.createBudgetAsync request))))

(defn create-subscriber-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of CreateSubscriber - `com.amazonaws.services.budgets.model.CreateSubscriberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubscriber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.CreateSubscriberResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateSubscriberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubscriberAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateSubscriberRequest request]
    (-> this (.createSubscriberAsync request))))

(defn update-subscriber-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of UpdateSubscriber - `com.amazonaws.services.budgets.model.UpdateSubscriberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSubscriber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.UpdateSubscriberResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateSubscriberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSubscriberAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateSubscriberRequest request]
    (-> this (.updateSubscriberAsync request))))

(defn describe-budgets-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DescribeBudgets - `com.amazonaws.services.budgets.model.DescribeBudgetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBudgets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeBudgetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBudgetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetsRequest request]
    (-> this (.describeBudgetsAsync request))))

(defn create-notification-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of CreateNotification - `com.amazonaws.services.budgets.model.CreateNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNotification operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.CreateNotificationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateNotificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNotificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.CreateNotificationRequest request]
    (-> this (.createNotificationAsync request))))

(defn describe-budget-performance-history-async
  "Description copied from interface: AWSBudgetsAsync

  request - `com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBudgetPerformanceHistory operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBudgetPerformanceHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest request]
    (-> this (.describeBudgetPerformanceHistoryAsync request))))

(defn update-notification-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of UpdateNotification - `com.amazonaws.services.budgets.model.UpdateNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNotification operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.UpdateNotificationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateNotificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNotificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.UpdateNotificationRequest request]
    (-> this (.updateNotificationAsync request))))

(defn describe-subscribers-for-notification-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DescribeSubscribersForNotification - `com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubscribersForNotification operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubscribersForNotificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest request]
    (-> this (.describeSubscribersForNotificationAsync request))))

(defn describe-notifications-for-budget-async
  "Description copied from interface: AWSBudgetsAsync

  request - Request of DescribeNotificationsForBudget - `com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNotificationsForBudget operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNotificationsForBudgetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBudgetsAsync this ^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest request]
    (-> this (.describeNotificationsForBudgetAsync request))))

