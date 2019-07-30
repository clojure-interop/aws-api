(ns com.amazonaws.services.applicationinsights.AbstractAmazonApplicationInsightsAsync
  "Abstract implementation of AmazonApplicationInsightsAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.applicationinsights AbstractAmazonApplicationInsightsAsync]))

(defn create-component-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.CreateComponentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.CreateComponentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.CreateComponentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createComponentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.CreateComponentRequest request]
    (-> this (.createComponentAsync request))))

(defn list-applications-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.ListApplicationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListApplicationsRequest request]
    (-> this (.listApplicationsAsync request))))

(defn create-application-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.CreateApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.CreateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.CreateApplicationRequest request]
    (-> this (.createApplicationAsync request))))

(defn describe-observation-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeObservationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeObservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeObservationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeObservationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeObservationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeObservationRequest request]
    (-> this (.describeObservationAsync request))))

(defn describe-problem-observations-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProblemObservations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProblemObservationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest request]
    (-> this (.describeProblemObservationsAsync request))))

(defn delete-application-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest request]
    (-> this (.deleteApplicationAsync request))))

(defn describe-component-configuration-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComponentConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComponentConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest request]
    (-> this (.describeComponentConfigurationAsync request))))

(defn describe-application-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest request]
    (-> this (.describeApplicationAsync request))))

(defn describe-problem-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeProblemRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProblem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeProblemResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeProblemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProblemAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeProblemRequest request]
    (-> this (.describeProblemAsync request))))

(defn delete-component-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DeleteComponentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DeleteComponentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DeleteComponentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteComponentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DeleteComponentRequest request]
    (-> this (.deleteComponentAsync request))))

(defn list-components-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.ListComponentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListComponents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.ListComponentsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListComponentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listComponentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListComponentsRequest request]
    (-> this (.listComponentsAsync request))))

(defn describe-component-configuration-recommendation-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComponentConfigurationRecommendation operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComponentConfigurationRecommendationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest request]
    (-> this (.describeComponentConfigurationRecommendationAsync request))))

(defn list-problems-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.ListProblemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProblems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.ListProblemsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListProblemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProblemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.ListProblemsRequest request]
    (-> this (.listProblemsAsync request))))

(defn update-component-configuration-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateComponentConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateComponentConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest request]
    (-> this (.updateComponentConfigurationAsync request))))

(defn describe-component-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.DescribeComponentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComponentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.DescribeComponentRequest request]
    (-> this (.describeComponentAsync request))))

(defn update-component-async
  "Description copied from interface: AmazonApplicationInsightsAsync

  request - `com.amazonaws.services.applicationinsights.model.UpdateComponentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateComponent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationinsights.model.UpdateComponentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.UpdateComponentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateComponentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApplicationInsightsAsync this ^com.amazonaws.services.applicationinsights.model.UpdateComponentRequest request]
    (-> this (.updateComponentAsync request))))

