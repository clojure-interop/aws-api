(ns com.amazonaws.services.cloudsearchv2.AmazonCloudSearchAsyncClient
  "Client for accessing Amazon CloudSearch asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon CloudSearch Configuration Service

  You use the Amazon CloudSearch configuration service to create, configure, and manage search domains. Configuration
  service requests are submitted using the AWS Query protocol. AWS Query requests are HTTP or HTTPS requests submitted
  via HTTP GET or POST with a query parameter named Action.


  The endpoint for configuration service requests is region-specific: cloudsearch.region.amazonaws.com. For
  example, cloudsearch.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see Regions and
  Endpoints."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudsearchv2 AmazonCloudSearchAsyncClient]))

(defn ->amazon-cloud-search-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonCloudSearchAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudSearchAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonCloudSearchAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudSearchAsyncClient aws-credentials executor-service))
  (^AmazonCloudSearchAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudSearchAsyncClient client-configuration))
  (^AmazonCloudSearchAsyncClient []
    (new AmazonCloudSearchAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.cloudsearchv2.AmazonCloudSearchAsyncClientBuilder`"
  (^com.amazonaws.services.cloudsearchv2.AmazonCloudSearchAsyncClientBuilder []
    (AmazonCloudSearchAsyncClient/asyncBuilder )))

(defn update-availability-options-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the UpdateAvailabilityOptions operation. Specifies the name of the domain you want to update and the Multi-AZ availability option. - `com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAvailabilityOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAvailabilityOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest request]
    (-> this (.updateAvailabilityOptionsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonCloudSearchAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-domain-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DeleteDomain operation. Specifies the name of the domain you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest request]
    (-> this (.deleteDomainAsync request))))

(defn delete-analysis-scheme-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DeleteAnalysisScheme operation. Specifies the name of the domain you want to update and the analysis scheme you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAnalysisScheme operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAnalysisSchemeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest request]
    (-> this (.deleteAnalysisSchemeAsync request))))

(defn describe-domains-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DescribeDomains operation. By default shows the status of all domains. To restrict the response to particular domains, specify the names of the domains you want to describe. - `com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDomains operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDomainsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest request]
    (-> this (.describeDomainsAsync request)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this]
    (-> this (.describeDomainsAsync))))

(defn describe-analysis-schemes-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DescribeAnalysisSchemes operation. Specifies the name of the domain you want to describe. To limit the response to particular analysis schemes, specify the names of the analysis schemes you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAnalysisSchemes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAnalysisSchemesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest request]
    (-> this (.describeAnalysisSchemesAsync request))))

(defn update-service-access-policies-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the UpdateServiceAccessPolicies operation. Specifies the name of the domain you want to update and the access rules you want to configure. - `com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServiceAccessPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceAccessPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest request]
    (-> this (.updateServiceAccessPoliciesAsync request))))

(defn delete-suggester-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DeleteSuggester operation. Specifies the name of the domain you want to update and name of the suggester you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSuggester operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSuggesterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest request]
    (-> this (.deleteSuggesterAsync request))))

(defn define-suggester-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DefineSuggester operation. Specifies the name of the domain you want to update and the suggester configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DefineSuggester operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.defineSuggesterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest request]
    (-> this (.defineSuggesterAsync request))))

(defn list-domain-names-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - `com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomainNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainNamesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest request]
    (-> this (.listDomainNamesAsync request)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this]
    (-> this (.listDomainNamesAsync))))

(defn describe-service-access-policies-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DescribeServiceAccessPolicies operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServiceAccessPolicies operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServiceAccessPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest request]
    (-> this (.describeServiceAccessPoliciesAsync request))))

(defn update-scaling-parameters-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the UpdateScalingParameters operation. Specifies the name of the domain you want to update and the scaling parameters you want to configure. - `com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateScalingParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateScalingParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest request]
    (-> this (.updateScalingParametersAsync request))))

(defn describe-index-fields-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DescribeIndexFields operation. Specifies the name of the domain you want to describe. To restrict the response to particular index fields, specify the names of the index fields you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIndexFields operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIndexFieldsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest request]
    (-> this (.describeIndexFieldsAsync request))))

(defn delete-index-field-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DeleteIndexField operation. Specifies the name of the domain you want to update and the name of the index field you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIndexField operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIndexFieldAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest request]
    (-> this (.deleteIndexFieldAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonCloudSearchAsyncClient this]
    (-> this (.shutdown))))

(defn delete-expression-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DeleteExpression operation. Specifies the name of the domain you want to update and the name of the expression you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteExpression operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteExpressionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest request]
    (-> this (.deleteExpressionAsync request))))

(defn describe-suggesters-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DescribeSuggester operation. Specifies the name of the domain you want to describe. To restrict the response to particular suggesters, specify the names of the suggesters you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSuggesters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSuggestersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest request]
    (-> this (.describeSuggestersAsync request))))

(defn create-domain-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the CreateDomain operation. Specifies a name for the new search domain. - `com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.CreateDomainResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest request]
    (-> this (.createDomainAsync request))))

(defn build-suggesters-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the BuildSuggester operation. Specifies the name of the domain you want to update. - `com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BuildSuggesters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.buildSuggestersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest request]
    (-> this (.buildSuggestersAsync request))))

(defn describe-expressions-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DescribeDomains operation. Specifies the name of the domain you want to describe. To restrict the response to particular expressions, specify the names of the expressions you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExpressions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExpressionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest request]
    (-> this (.describeExpressionsAsync request))))

(defn define-index-field-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DefineIndexField operation. Specifies the name of the domain you want to update and the index field configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DefineIndexField operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.defineIndexFieldAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest request]
    (-> this (.defineIndexFieldAsync request))))

(defn describe-scaling-parameters-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DescribeScalingParameters operation. Specifies the name of the domain you want to describe. - `com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest request]
    (-> this (.describeScalingParametersAsync request))))

(defn define-expression-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DefineExpression operation. Specifies the name of the domain you want to update and the expression you want to configure. - `com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DefineExpression operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.defineExpressionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest request]
    (-> this (.defineExpressionAsync request))))

(defn describe-availability-options-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DescribeAvailabilityOptions operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAvailabilityOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAvailabilityOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest request]
    (-> this (.describeAvailabilityOptionsAsync request))))

(defn index-documents-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the IndexDocuments operation. Specifies the name of the domain you want to re-index. - `com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IndexDocuments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.indexDocumentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest request]
    (-> this (.indexDocumentsAsync request))))

(defn define-analysis-scheme-async
  "Description copied from interface: AmazonCloudSearchAsync

  request - Container for the parameters to the DefineAnalysisScheme operation. Specifies the name of the domain you want to update and the analysis scheme configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DefineAnalysisScheme operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.defineAnalysisSchemeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsyncClient this ^com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest request]
    (-> this (.defineAnalysisSchemeAsync request))))

