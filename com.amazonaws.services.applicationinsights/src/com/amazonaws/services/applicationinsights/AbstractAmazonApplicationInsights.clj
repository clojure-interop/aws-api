(ns com.amazonaws.services.applicationinsights.AbstractAmazonApplicationInsights
  "Abstract implementation of AmazonApplicationInsights. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.applicationinsights AbstractAmazonApplicationInsights]))

(defn update-component
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.UpdateComponentRequest`

  returns: Result of the UpdateComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.UpdateComponentResult`"
  (^com.amazonaws.services.applicationinsights.model.UpdateComponentResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.UpdateComponentRequest request]
    (-> this (.updateComponent request))))

(defn describe-application
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest`

  returns: Result of the DescribeApplication operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeApplicationResult`"
  (^com.amazonaws.services.applicationinsights.model.DescribeApplicationResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest request]
    (-> this (.describeApplication request))))

(defn describe-problem
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.DescribeProblemRequest`

  returns: Result of the DescribeProblem operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeProblemResult`"
  (^com.amazonaws.services.applicationinsights.model.DescribeProblemResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeProblemRequest request]
    (-> this (.describeProblem request))))

(defn update-component-configuration
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest`

  returns: Result of the UpdateComponentConfiguration operation returned by the service. - `com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationResult`"
  (^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest request]
    (-> this (.updateComponentConfiguration request))))

(defn describe-observation
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.DescribeObservationRequest`

  returns: Result of the DescribeObservation operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeObservationResult`"
  (^com.amazonaws.services.applicationinsights.model.DescribeObservationResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeObservationRequest request]
    (-> this (.describeObservation request))))

(defn delete-application
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DeleteApplicationResult`"
  (^com.amazonaws.services.applicationinsights.model.DeleteApplicationResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest request]
    (-> this (.deleteApplication request))))

(defn describe-component-configuration-recommendation
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest`

  returns: Result of the DescribeComponentConfigurationRecommendation operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationResult`"
  (^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest request]
    (-> this (.describeComponentConfigurationRecommendation request))))

(defn list-applications
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.applicationinsights.model.ListApplicationsResult`"
  (^com.amazonaws.services.applicationinsights.model.ListApplicationsResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.ListApplicationsRequest request]
    (-> this (.listApplications request))))

(defn list-components
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.ListComponentsRequest`

  returns: Result of the ListComponents operation returned by the service. - `com.amazonaws.services.applicationinsights.model.ListComponentsResult`"
  (^com.amazonaws.services.applicationinsights.model.ListComponentsResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.ListComponentsRequest request]
    (-> this (.listComponents request))))

(defn describe-component-configuration
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest`

  returns: Result of the DescribeComponentConfiguration operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationResult`"
  (^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest request]
    (-> this (.describeComponentConfiguration request))))

(defn delete-component
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.DeleteComponentRequest`

  returns: Result of the DeleteComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DeleteComponentResult`"
  (^com.amazonaws.services.applicationinsights.model.DeleteComponentResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DeleteComponentRequest request]
    (-> this (.deleteComponent request))))

(defn shutdown
  "Description copied from interface: AmazonApplicationInsights"
  ([^AbstractAmazonApplicationInsights this]
    (-> this (.shutdown))))

(defn create-component
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.CreateComponentRequest`

  returns: Result of the CreateComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.CreateComponentResult`"
  (^com.amazonaws.services.applicationinsights.model.CreateComponentResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.CreateComponentRequest request]
    (-> this (.createComponent request))))

(defn create-application
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.applicationinsights.model.CreateApplicationResult`"
  (^com.amazonaws.services.applicationinsights.model.CreateApplicationResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn describe-problem-observations
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest`

  returns: Result of the DescribeProblemObservations operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsResult`"
  (^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest request]
    (-> this (.describeProblemObservations request))))

(defn list-problems
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.ListProblemsRequest`

  returns: Result of the ListProblems operation returned by the service. - `com.amazonaws.services.applicationinsights.model.ListProblemsResult`"
  (^com.amazonaws.services.applicationinsights.model.ListProblemsResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.ListProblemsRequest request]
    (-> this (.listProblems request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonApplicationInsights

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonApplicationInsights this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-component
  "Description copied from interface: AmazonApplicationInsights

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentRequest`

  returns: Result of the DescribeComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeComponentResult`"
  (^com.amazonaws.services.applicationinsights.model.DescribeComponentResult [^AbstractAmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeComponentRequest request]
    (-> this (.describeComponent request))))

