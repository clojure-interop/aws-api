(ns com.amazonaws.services.budgets.AbstractAWSBudgets
  "Abstract implementation of AWSBudgets. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.budgets AbstractAWSBudgets]))

(defn update-budget
  "Description copied from interface: AWSBudgets

  request - Request of UpdateBudget - `com.amazonaws.services.budgets.model.UpdateBudgetRequest`

  returns: Result of the UpdateBudget operation returned by the service. - `com.amazonaws.services.budgets.model.UpdateBudgetResult`"
  (^com.amazonaws.services.budgets.model.UpdateBudgetResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.UpdateBudgetRequest request]
    (-> this (.updateBudget request))))

(defn create-subscriber
  "Description copied from interface: AWSBudgets

  request - Request of CreateSubscriber - `com.amazonaws.services.budgets.model.CreateSubscriberRequest`

  returns: Result of the CreateSubscriber operation returned by the service. - `com.amazonaws.services.budgets.model.CreateSubscriberResult`"
  (^com.amazonaws.services.budgets.model.CreateSubscriberResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.CreateSubscriberRequest request]
    (-> this (.createSubscriber request))))

(defn set-region
  "Description copied from interface: AWSBudgets

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSBudgets this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-subscribers-for-notification
  "Description copied from interface: AWSBudgets

  request - Request of DescribeSubscribersForNotification - `com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest`

  returns: Result of the DescribeSubscribersForNotification operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult`"
  (^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest request]
    (-> this (.describeSubscribersForNotification request))))

(defn create-notification
  "Description copied from interface: AWSBudgets

  request - Request of CreateNotification - `com.amazonaws.services.budgets.model.CreateNotificationRequest`

  returns: Result of the CreateNotification operation returned by the service. - `com.amazonaws.services.budgets.model.CreateNotificationResult`"
  (^com.amazonaws.services.budgets.model.CreateNotificationResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.CreateNotificationRequest request]
    (-> this (.createNotification request))))

(defn describe-budget-performance-history
  "Description copied from interface: AWSBudgets

  request - `com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest`

  returns: Result of the DescribeBudgetPerformanceHistory operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryResult`"
  (^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.DescribeBudgetPerformanceHistoryRequest request]
    (-> this (.describeBudgetPerformanceHistory request))))

(defn describe-budget
  "Description copied from interface: AWSBudgets

  request - Request of DescribeBudget - `com.amazonaws.services.budgets.model.DescribeBudgetRequest`

  returns: Result of the DescribeBudget operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeBudgetResult`"
  (^com.amazonaws.services.budgets.model.DescribeBudgetResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.DescribeBudgetRequest request]
    (-> this (.describeBudget request))))

(defn describe-budgets
  "Description copied from interface: AWSBudgets

  request - Request of DescribeBudgets - `com.amazonaws.services.budgets.model.DescribeBudgetsRequest`

  returns: Result of the DescribeBudgets operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeBudgetsResult`"
  (^com.amazonaws.services.budgets.model.DescribeBudgetsResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.DescribeBudgetsRequest request]
    (-> this (.describeBudgets request))))

(defn shutdown
  "Description copied from interface: AWSBudgets"
  ([^AbstractAWSBudgets this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Description copied from interface: AWSBudgets

  endpoint - The endpoint (ex: \"budgets.amazonaws.com\") or a full URL, including the protocol (ex: \"budgets.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSBudgets this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-subscriber
  "Description copied from interface: AWSBudgets

  request - Request of UpdateSubscriber - `com.amazonaws.services.budgets.model.UpdateSubscriberRequest`

  returns: Result of the UpdateSubscriber operation returned by the service. - `com.amazonaws.services.budgets.model.UpdateSubscriberResult`"
  (^com.amazonaws.services.budgets.model.UpdateSubscriberResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.UpdateSubscriberRequest request]
    (-> this (.updateSubscriber request))))

(defn update-notification
  "Description copied from interface: AWSBudgets

  request - Request of UpdateNotification - `com.amazonaws.services.budgets.model.UpdateNotificationRequest`

  returns: Result of the UpdateNotification operation returned by the service. - `com.amazonaws.services.budgets.model.UpdateNotificationResult`"
  (^com.amazonaws.services.budgets.model.UpdateNotificationResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.UpdateNotificationRequest request]
    (-> this (.updateNotification request))))

(defn delete-budget
  "Description copied from interface: AWSBudgets

  request - Request of DeleteBudget - `com.amazonaws.services.budgets.model.DeleteBudgetRequest`

  returns: Result of the DeleteBudget operation returned by the service. - `com.amazonaws.services.budgets.model.DeleteBudgetResult`"
  (^com.amazonaws.services.budgets.model.DeleteBudgetResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.DeleteBudgetRequest request]
    (-> this (.deleteBudget request))))

(defn delete-notification
  "Description copied from interface: AWSBudgets

  request - Request of DeleteNotification - `com.amazonaws.services.budgets.model.DeleteNotificationRequest`

  returns: Result of the DeleteNotification operation returned by the service. - `com.amazonaws.services.budgets.model.DeleteNotificationResult`"
  (^com.amazonaws.services.budgets.model.DeleteNotificationResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.DeleteNotificationRequest request]
    (-> this (.deleteNotification request))))

(defn delete-subscriber
  "Description copied from interface: AWSBudgets

  request - Request of DeleteSubscriber - `com.amazonaws.services.budgets.model.DeleteSubscriberRequest`

  returns: Result of the DeleteSubscriber operation returned by the service. - `com.amazonaws.services.budgets.model.DeleteSubscriberResult`"
  (^com.amazonaws.services.budgets.model.DeleteSubscriberResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.DeleteSubscriberRequest request]
    (-> this (.deleteSubscriber request))))

(defn describe-notifications-for-budget
  "Description copied from interface: AWSBudgets

  request - Request of DescribeNotificationsForBudget - `com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest`

  returns: Result of the DescribeNotificationsForBudget operation returned by the service. - `com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult`"
  (^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest request]
    (-> this (.describeNotificationsForBudget request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSBudgets

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSBudgets this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-budget
  "Description copied from interface: AWSBudgets

  request - Request of CreateBudget - `com.amazonaws.services.budgets.model.CreateBudgetRequest`

  returns: Result of the CreateBudget operation returned by the service. - `com.amazonaws.services.budgets.model.CreateBudgetResult`"
  (^com.amazonaws.services.budgets.model.CreateBudgetResult [^AbstractAWSBudgets this ^com.amazonaws.services.budgets.model.CreateBudgetRequest request]
    (-> this (.createBudget request))))

