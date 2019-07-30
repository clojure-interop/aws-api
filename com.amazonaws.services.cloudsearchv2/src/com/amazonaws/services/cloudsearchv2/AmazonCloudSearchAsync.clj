(ns com.amazonaws.services.cloudsearchv2.AmazonCloudSearchAsync
  "Interface for accessing Amazon CloudSearch asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCloudSearchAsync instead.


  Amazon CloudSearch Configuration Service

  You use the Amazon CloudSearch configuration service to create, configure, and manage search domains. Configuration
  service requests are submitted using the AWS Query protocol. AWS Query requests are HTTP or HTTPS requests submitted
  via HTTP GET or POST with a query parameter named Action.


  The endpoint for configuration service requests is region-specific: cloudsearch.region.amazonaws.com. For
  example, cloudsearch.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see Regions and
  Endpoints."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudsearchv2 AmazonCloudSearchAsync]))

(defn update-availability-options-async
  "Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch
   domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a
   service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more
   information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.

  update-availability-options-request - Container for the parameters to the UpdateAvailabilityOptions operation. Specifies the name of the domain you want to update and the Multi-AZ availability option. - `com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAvailabilityOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest update-availability-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAvailabilityOptionsAsync update-availability-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest update-availability-options-request]
    (-> this (.updateAvailabilityOptionsAsync update-availability-options-request))))

(defn delete-domain-async
  "Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered.
   For more information, see Deleting a Search Domain in the Amazon CloudSearch Developer Guide.

  delete-domain-request - Container for the parameters to the DeleteDomain operation. Specifies the name of the domain you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DeleteDomainResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest delete-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainAsync delete-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DeleteDomainRequest delete-domain-request]
    (-> this (.deleteDomainAsync delete-domain-request))))

(defn delete-analysis-scheme-async
  "Deletes an analysis scheme. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.

  delete-analysis-scheme-request - Container for the parameters to the DeleteAnalysisScheme operation. Specifies the name of the domain you want to update and the analysis scheme you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAnalysisScheme operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest delete-analysis-scheme-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAnalysisSchemeAsync delete-analysis-scheme-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DeleteAnalysisSchemeRequest delete-analysis-scheme-request]
    (-> this (.deleteAnalysisSchemeAsync delete-analysis-scheme-request))))

(defn describe-domains-async
  "Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all
   domains by default. To get the number of searchable documents in a domain, use the console or submit a
   matchall request to your domain's search endpoint:
   q=matchall&amp;q.parser=structured&amp;size=0. For more information, see Getting Information about a Search Domain in the Amazon CloudSearch Developer Guide.

  describe-domains-request - Container for the parameters to the DescribeDomains operation. By default shows the status of all domains. To restrict the response to particular domains, specify the names of the domains you want to describe. - `com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDomains operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeDomainsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest describe-domains-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDomainsAsync describe-domains-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeDomainsRequest describe-domains-request]
    (-> this (.describeDomainsAsync describe-domains-request)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this]
    (-> this (.describeDomainsAsync))))

(defn describe-analysis-schemes-async
  "Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing
   options for a text field. Can be limited to specific analysis schemes by name. By default, shows all
   analysis schemes and includes any pending changes to the configuration. Set the Deployed option to
   true to show the active configuration and exclude pending changes. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.

  describe-analysis-schemes-request - Container for the parameters to the DescribeAnalysisSchemes operation. Specifies the name of the domain you want to describe. To limit the response to particular analysis schemes, specify the names of the analysis schemes you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAnalysisSchemes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest describe-analysis-schemes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAnalysisSchemesAsync describe-analysis-schemes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeAnalysisSchemesRequest describe-analysis-schemes-request]
    (-> this (.describeAnalysisSchemesAsync describe-analysis-schemes-request))))

(defn update-service-access-policies-async
  "Configures the access rules that control access to the domain's document and search endpoints. For more
   information, see  Configuring Access for an Amazon CloudSearch Domain.

  update-service-access-policies-request - Container for the parameters to the UpdateServiceAccessPolicies operation. Specifies the name of the domain you want to update and the access rules you want to configure. - `com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServiceAccessPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest update-service-access-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceAccessPoliciesAsync update-service-access-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.UpdateServiceAccessPoliciesRequest update-service-access-policies-request]
    (-> this (.updateServiceAccessPoliciesAsync update-service-access-policies-request))))

(defn delete-suggester-async
  "Deletes a suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.

  delete-suggester-request - Container for the parameters to the DeleteSuggester operation. Specifies the name of the domain you want to update and name of the suggester you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSuggester operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest delete-suggester-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSuggesterAsync delete-suggester-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DeleteSuggesterRequest delete-suggester-request]
    (-> this (.deleteSuggesterAsync delete-suggester-request))))

(defn define-suggester-async
  "Configures a suggester for a domain. A suggester enables you to display possible matches before users finish
   typing their queries. When you configure a suggester, you must specify the name of the text field you want to
   search for possible matches and a unique name for the suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.

  define-suggester-request - Container for the parameters to the DefineSuggester operation. Specifies the name of the domain you want to update and the suggester configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DefineSuggester operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DefineSuggesterResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest define-suggester-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.defineSuggesterAsync define-suggester-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DefineSuggesterRequest define-suggester-request]
    (-> this (.defineSuggesterAsync define-suggester-request))))

(defn list-domain-names-async
  "Lists all search domains owned by an account.

  list-domain-names-request - `com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomainNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.ListDomainNamesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest list-domain-names-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainNamesAsync list-domain-names-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.ListDomainNamesRequest list-domain-names-request]
    (-> this (.listDomainNamesAsync list-domain-names-request)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this]
    (-> this (.listDomainNamesAsync))))

(defn describe-service-access-policies-async
  "Gets information about the access policies that control access to the domain's document and search endpoints. By
   default, shows the configuration with any pending changes. Set the Deployed option to
   true to show the active configuration and exclude pending changes. For more information, see Configuring Access for a Search Domain in the Amazon CloudSearch Developer Guide.

  describe-service-access-policies-request - Container for the parameters to the DescribeServiceAccessPolicies operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServiceAccessPolicies operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest describe-service-access-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServiceAccessPoliciesAsync describe-service-access-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeServiceAccessPoliciesRequest describe-service-access-policies-request]
    (-> this (.describeServiceAccessPoliciesAsync describe-service-access-policies-request))))

(defn update-scaling-parameters-async
  "Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance
   type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of
   data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is
   enabled, these values control the resources used per Availability Zone. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.

  update-scaling-parameters-request - Container for the parameters to the UpdateScalingParameters operation. Specifies the name of the domain you want to update and the scaling parameters you want to configure. - `com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateScalingParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest update-scaling-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateScalingParametersAsync update-scaling-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.UpdateScalingParametersRequest update-scaling-parameters-request]
    (-> this (.updateScalingParametersAsync update-scaling-parameters-request))))

(defn describe-index-fields-async
  "Gets information about the index fields configured for the search domain. Can be limited to specific fields by
   name. By default, shows all fields and includes any pending changes to the configuration. Set the
   Deployed option to true to show the active configuration and exclude pending changes.
   For more information, see Getting Domain Information in the Amazon CloudSearch Developer Guide.

  describe-index-fields-request - Container for the parameters to the DescribeIndexFields operation. Specifies the name of the domain you want to describe. To restrict the response to particular index fields, specify the names of the index fields you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIndexFields operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest describe-index-fields-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIndexFieldsAsync describe-index-fields-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeIndexFieldsRequest describe-index-fields-request]
    (-> this (.describeIndexFieldsAsync describe-index-fields-request))))

(defn delete-index-field-async
  "Removes an IndexField from the search domain. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.

  delete-index-field-request - Container for the parameters to the DeleteIndexField operation. Specifies the name of the domain you want to update and the name of the index field you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIndexField operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest delete-index-field-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIndexFieldAsync delete-index-field-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DeleteIndexFieldRequest delete-index-field-request]
    (-> this (.deleteIndexFieldAsync delete-index-field-request))))

(defn delete-expression-async
  "Removes an Expression from the search domain. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.

  delete-expression-request - Container for the parameters to the DeleteExpression operation. Specifies the name of the domain you want to update and the name of the expression you want to delete. - `com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteExpression operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DeleteExpressionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest delete-expression-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteExpressionAsync delete-expression-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DeleteExpressionRequest delete-expression-request]
    (-> this (.deleteExpressionAsync delete-expression-request))))

(defn describe-suggesters-async
  "Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users
   finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and
   includes any pending changes to the configuration. Set the Deployed option to true to
   show the active configuration and exclude pending changes. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.

  describe-suggesters-request - Container for the parameters to the DescribeSuggester operation. Specifies the name of the domain you want to describe. To restrict the response to particular suggesters, specify the names of the suggesters you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSuggesters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest describe-suggesters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSuggestersAsync describe-suggesters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeSuggestersRequest describe-suggesters-request]
    (-> this (.describeSuggestersAsync describe-suggesters-request))))

(defn create-domain-async
  "Creates a new search domain. For more information, see Creating a Search Domain in the Amazon CloudSearch Developer Guide.

  create-domain-request - Container for the parameters to the CreateDomain operation. Specifies a name for the new search domain. - `com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.CreateDomainResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest create-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainAsync create-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.CreateDomainRequest create-domain-request]
    (-> this (.createDomainAsync create-domain-request))))

(defn build-suggesters-async
  "Indexes the search suggestions. For more information, see Configuring Suggesters in the Amazon CloudSearch Developer Guide.

  build-suggesters-request - Container for the parameters to the BuildSuggester operation. Specifies the name of the domain you want to update. - `com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BuildSuggesters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.BuildSuggestersResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest build-suggesters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.buildSuggestersAsync build-suggesters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.BuildSuggestersRequest build-suggesters-request]
    (-> this (.buildSuggestersAsync build-suggesters-request))))

(defn describe-expressions-async
  "Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By
   default, shows all expressions and includes any pending changes to the configuration. Set the
   Deployed option to true to show the active configuration and exclude pending changes.
   For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.

  describe-expressions-request - Container for the parameters to the DescribeDomains operation. Specifies the name of the domain you want to describe. To restrict the response to particular expressions, specify the names of the expressions you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExpressions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest describe-expressions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExpressionsAsync describe-expressions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeExpressionsRequest describe-expressions-request]
    (-> this (.describeExpressionsAsync describe-expressions-request))))

(defn define-index-field-async
  "Configures an IndexField for the search domain. Used to create new fields and modify existing
   ones. You must specify the name of the domain you are configuring and an index field configuration. The index
   field configuration specifies a unique name, the index field type, and the options you want to configure for the
   field. The options you can specify depend on the IndexFieldType. If the field exists, the new
   configuration replaces the old one. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.

  define-index-field-request - Container for the parameters to the DefineIndexField operation. Specifies the name of the domain you want to update and the index field configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DefineIndexField operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest define-index-field-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.defineIndexFieldAsync define-index-field-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DefineIndexFieldRequest define-index-field-request]
    (-> this (.defineIndexFieldAsync define-index-field-request))))

(defn describe-scaling-parameters-async
  "Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search
   instance type and replication count. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.

  describe-scaling-parameters-request - Container for the parameters to the DescribeScalingParameters operation. Specifies the name of the domain you want to describe. - `com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest describe-scaling-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingParametersAsync describe-scaling-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeScalingParametersRequest describe-scaling-parameters-request]
    (-> this (.describeScalingParametersAsync describe-scaling-parameters-request))))

(defn define-expression-async
  "Configures an Expression for the search domain. Used to create new expressions and modify
   existing ones. If the expression exists, the new configuration replaces the old one. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.

  define-expression-request - Container for the parameters to the DefineExpression operation. Specifies the name of the domain you want to update and the expression you want to configure. - `com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DefineExpression operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DefineExpressionResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest define-expression-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.defineExpressionAsync define-expression-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DefineExpressionRequest define-expression-request]
    (-> this (.defineExpressionAsync define-expression-request))))

(defn describe-availability-options-async
  "Gets the availability options configured for a domain. By default, shows the configuration with any pending
   changes. Set the Deployed option to true to show the active configuration and exclude
   pending changes. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.

  describe-availability-options-request - Container for the parameters to the DescribeAvailabilityOptions operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to true. - `com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAvailabilityOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest describe-availability-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAvailabilityOptionsAsync describe-availability-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest describe-availability-options-request]
    (-> this (.describeAvailabilityOptionsAsync describe-availability-options-request))))

(defn index-documents-async
  "Tells the search domain to start indexing its documents using the latest indexing options. This operation must be
   invoked to activate options whose OptionStatus is RequiresIndexDocuments.

  index-documents-request - Container for the parameters to the IndexDocuments operation. Specifies the name of the domain you want to re-index. - `com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IndexDocuments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.IndexDocumentsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest index-documents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.indexDocumentsAsync index-documents-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.IndexDocumentsRequest index-documents-request]
    (-> this (.indexDocumentsAsync index-documents-request))))

(defn define-analysis-scheme-async
  "Configures an analysis scheme that can be applied to a text or text-array field to
   define language-specific text processing options. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.

  define-analysis-scheme-request - Container for the parameters to the DefineAnalysisScheme operation. Specifies the name of the domain you want to update and the analysis scheme configuration. - `com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DefineAnalysisScheme operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeResult>`"
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest define-analysis-scheme-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.defineAnalysisSchemeAsync define-analysis-scheme-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudSearchAsync this ^com.amazonaws.services.cloudsearchv2.model.DefineAnalysisSchemeRequest define-analysis-scheme-request]
    (-> this (.defineAnalysisSchemeAsync define-analysis-scheme-request))))

