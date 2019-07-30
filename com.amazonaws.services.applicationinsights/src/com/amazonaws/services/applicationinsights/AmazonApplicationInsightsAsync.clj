(ns com.amazonaws.services.applicationinsights.AmazonApplicationInsightsAsync
  "Interface for accessing Application Insights asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonApplicationInsightsAsync instead.


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
  (:import [com.amazonaws.services.applicationinsights AmazonApplicationInsightsAsync]))

(defn create-component-async
  "Creates a custom component by grouping similar standalone instances to monitor.

  create-component-request - `com.amazonaws.services.applicationinsights.model.CreateComponentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.CreateComponentResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.CreateComponentRequest create-component-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createComponentAsync create-component-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.CreateComponentRequest create-component-request]
    (-> this (.createComponentAsync create-component-request))))

(defn list-applications-async
  "Lists the IDs of the applications that you are monitoring.

  list-applications-request - `com.amazonaws.services.applicationinsights.model.ListApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListApplicationsRequest list-applications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync list-applications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListApplicationsRequest list-applications-request]
    (-> this (.listApplicationsAsync list-applications-request))))

(defn create-application-async
  "Adds an application that is created from a resource group.

  create-application-request - `com.amazonaws.services.applicationinsights.model.CreateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.CreateApplicationRequest create-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync create-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplicationAsync create-application-request))))

(defn describe-observation-async
  "Describes an anomaly or error with the application.

  describe-observation-request - `com.amazonaws.services.applicationinsights.model.DescribeObservationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeObservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeObservationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeObservationRequest describe-observation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeObservationAsync describe-observation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeObservationRequest describe-observation-request]
    (-> this (.describeObservationAsync describe-observation-request))))

(defn describe-problem-observations-async
  "Describes the anomalies or errors associated with the problem.

  describe-problem-observations-request - `com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProblemObservations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest describe-problem-observations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProblemObservationsAsync describe-problem-observations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest describe-problem-observations-request]
    (-> this (.describeProblemObservationsAsync describe-problem-observations-request))))

(defn delete-application-async
  "Removes the specified application from monitoring. Does not delete the application.

  delete-application-request - `com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest delete-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync delete-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest delete-application-request]
    (-> this (.deleteApplicationAsync delete-application-request))))

(defn describe-component-configuration-async
  "Describes the monitoring configuration of the component.

  describe-component-configuration-request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComponentConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest describe-component-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComponentConfigurationAsync describe-component-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest describe-component-configuration-request]
    (-> this (.describeComponentConfigurationAsync describe-component-configuration-request))))

(defn describe-application-async
  "Describes the application.

  describe-application-request - `com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest describe-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationAsync describe-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest describe-application-request]
    (-> this (.describeApplicationAsync describe-application-request))))

(defn describe-problem-async
  "Describes an application problem.

  describe-problem-request - `com.amazonaws.services.applicationinsights.model.DescribeProblemRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProblem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeProblemResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeProblemRequest describe-problem-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProblemAsync describe-problem-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeProblemRequest describe-problem-request]
    (-> this (.describeProblemAsync describe-problem-request))))

(defn delete-component-async
  "Ungroups a custom component. When you ungroup custom components, all applicable monitors that are set up for the
   component are removed and the instances revert to their standalone status.

  delete-component-request - `com.amazonaws.services.applicationinsights.model.DeleteComponentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DeleteComponentResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DeleteComponentRequest delete-component-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteComponentAsync delete-component-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DeleteComponentRequest delete-component-request]
    (-> this (.deleteComponentAsync delete-component-request))))

(defn list-components-async
  "Lists the auto-grouped, standalone, and custom components of the application.

  list-components-request - `com.amazonaws.services.applicationinsights.model.ListComponentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListComponents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.ListComponentsResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListComponentsRequest list-components-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listComponentsAsync list-components-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListComponentsRequest list-components-request]
    (-> this (.listComponentsAsync list-components-request))))

(defn describe-component-configuration-recommendation-async
  "Describes the recommended monitoring configuration of the component.

  describe-component-configuration-recommendation-request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComponentConfigurationRecommendation operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest describe-component-configuration-recommendation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComponentConfigurationRecommendationAsync describe-component-configuration-recommendation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest describe-component-configuration-recommendation-request]
    (-> this (.describeComponentConfigurationRecommendationAsync describe-component-configuration-recommendation-request))))

(defn list-problems-async
  "Lists the problems with your application.

  list-problems-request - `com.amazonaws.services.applicationinsights.model.ListProblemsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProblems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.ListProblemsResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListProblemsRequest list-problems-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProblemsAsync list-problems-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListProblemsRequest list-problems-request]
    (-> this (.listProblemsAsync list-problems-request))))

(defn update-component-configuration-async
  "Updates the monitoring configurations for the component. The configuration input parameter is an escaped JSON of
   the configuration and should match the schema of what is returned by
   DescribeComponentConfigurationRecommendation.

  update-component-configuration-request - `com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateComponentConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest update-component-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateComponentConfigurationAsync update-component-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest update-component-configuration-request]
    (-> this (.updateComponentConfigurationAsync update-component-configuration-request))))

(defn describe-component-async
  "Describes a component and lists the resources that are grouped together in a component.

  describe-component-request - `com.amazonaws.services.applicationinsights.model.DescribeComponentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeComponentResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentRequest describe-component-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComponentAsync describe-component-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentRequest describe-component-request]
    (-> this (.describeComponentAsync describe-component-request))))

(defn update-component-async
  "Updates the custom component name and/or the list of resources that make up the component.

  update-component-request - `com.amazonaws.services.applicationinsights.model.UpdateComponentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.UpdateComponentResult>`"
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.UpdateComponentRequest update-component-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateComponentAsync update-component-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.UpdateComponentRequest update-component-request]
    (-> this (.updateComponentAsync update-component-request))))

