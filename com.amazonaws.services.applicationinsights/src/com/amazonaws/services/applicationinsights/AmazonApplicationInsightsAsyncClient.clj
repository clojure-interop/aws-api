(ns com.amazonaws.services.applicationinsights.AmazonApplicationInsightsAsyncClient
  "Client for accessing Application Insights asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon CloudWatch Application Insights for .NET and SQL Server

  Amazon CloudWatch Application Insights for .NET and SQL Server is a service that helps you detect common problems
  with your .NET and SQL Server-based applications. It enables you to pinpoint the source of issues in your
  applications (built with technologies such as Microsoft IIS, .NET, and Microsoft SQL Server), by providing key
  insights into detected problems.


  After you onboard your application, CloudWatch Application Insights for .NET and SQL Server identifies, recommends,
  and sets up metrics and logs. It continuously analyzes and correlates your metrics and logs for unusual behavior to
  surface actionable problems with your application. For example, if your application is slow and unresponsive and
  leading to HTTP 500 errors in your Application Load Balancer (ALB), Application Insights informs you that a memory
  pressure problem with your SQL Server database is occurring. It bases this analysis on impactful metrics and log
  errors."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.applicationinsights AmazonApplicationInsightsAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.applicationinsights.AmazonApplicationInsightsAsyncClientBuilder`"
  (^com.amazonaws.services.applicationinsights.AmazonApplicationInsightsAsyncClientBuilder []
    (AmazonApplicationInsightsAsyncClient/asyncBuilder )))

(defn create-component-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.CreateComponentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.CreateComponentResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.CreateComponentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createComponentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.CreateComponentRequest request]
    (-> this (.createComponentAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonApplicationInsightsAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-applications-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.ListApplicationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.ListApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.ListApplicationsRequest request]
    (-> this (.listApplicationsAsync request))))

(defn create-application-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.CreateApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.CreateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.CreateApplicationRequest request]
    (-> this (.createApplicationAsync request))))

(defn describe-observation-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeObservationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeObservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeObservationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeObservationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeObservationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeObservationRequest request]
    (-> this (.describeObservationAsync request))))

(defn describe-problem-observations-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProblemObservations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProblemObservationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest request]
    (-> this (.describeProblemObservationsAsync request))))

(defn delete-application-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest request]
    (-> this (.deleteApplicationAsync request))))

(defn describe-component-configuration-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComponentConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComponentConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest request]
    (-> this (.describeComponentConfigurationAsync request))))

(defn describe-application-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest request]
    (-> this (.describeApplicationAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonApplicationInsightsAsyncClient this]
    (-> this (.shutdown))))

(defn describe-problem-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeProblemRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProblem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeProblemResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeProblemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProblemAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeProblemRequest request]
    (-> this (.describeProblemAsync request))))

(defn delete-component-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DeleteComponentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DeleteComponentResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DeleteComponentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteComponentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DeleteComponentRequest request]
    (-> this (.deleteComponentAsync request))))

(defn list-components-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.ListComponentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListComponents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.ListComponentsResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.ListComponentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listComponentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.ListComponentsRequest request]
    (-> this (.listComponentsAsync request))))

(defn describe-component-configuration-recommendation-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComponentConfigurationRecommendation operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComponentConfigurationRecommendationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest request]
    (-> this (.describeComponentConfigurationRecommendationAsync request))))

(defn list-problems-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.ListProblemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProblems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.ListProblemsResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.ListProblemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProblemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.ListProblemsRequest request]
    (-> this (.listProblemsAsync request))))

(defn update-component-configuration-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateComponentConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateComponentConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest request]
    (-> this (.updateComponentConfigurationAsync request))))

(defn describe-component-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeComponentResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeComponentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComponentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.DescribeComponentRequest request]
    (-> this (.describeComponentAsync request))))

(defn update-component-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.UpdateComponentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.UpdateComponentResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.UpdateComponentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateComponentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsyncClient this ^com.amazonaws.services.applicationinsights.model.UpdateComponentRequest request]
    (-> this (.updateComponentAsync request))))

