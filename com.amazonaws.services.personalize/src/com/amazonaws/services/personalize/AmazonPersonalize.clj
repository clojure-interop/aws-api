(ns com.amazonaws.services.personalize.AmazonPersonalize
  "Interface for accessing Amazon Personalize.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPersonalize instead.



  Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to
  customers."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalize AmazonPersonalize]))

(defn describe-algorithm
  "Describes the given algorithm.

  describe-algorithm-request - `com.amazonaws.services.personalize.model.DescribeAlgorithmRequest`

  returns: Result of the DescribeAlgorithm operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeAlgorithmResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DescribeAlgorithmResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeAlgorithmRequest describe-algorithm-request]
    (-> this (.describeAlgorithm describe-algorithm-request))))

(defn describe-schema
  "Describes a schema. For more information on schemas, see CreateSchema.

  describe-schema-request - `com.amazonaws.services.personalize.model.DescribeSchemaRequest`

  returns: Result of the DescribeSchema operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeSchemaResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DescribeSchemaResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeSchemaRequest describe-schema-request]
    (-> this (.describeSchema describe-schema-request))))

(defn list-event-trackers
  "Returns the list of event trackers associated with the account. The response provides the properties for each
   event tracker, including the Amazon Resource Name (ARN) and tracking ID. For more information on event trackers,
   see CreateEventTracker.

  list-event-trackers-request - `com.amazonaws.services.personalize.model.ListEventTrackersRequest`

  returns: Result of the ListEventTrackers operation returned by the service. - `com.amazonaws.services.personalize.model.ListEventTrackersResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.ListEventTrackersResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.ListEventTrackersRequest list-event-trackers-request]
    (-> this (.listEventTrackers list-event-trackers-request))))

(defn list-dataset-import-jobs
  "Returns a list of dataset import jobs that use the given dataset. When a dataset is not specified, all the
   dataset import jobs associated with the account are listed. The response provides the properties for each dataset
   import job, including the Amazon Resource Name (ARN). For more information on dataset import jobs, see
   CreateDatasetImportJob. For more information on datasets, see CreateDataset.

  list-dataset-import-jobs-request - `com.amazonaws.services.personalize.model.ListDatasetImportJobsRequest`

  returns: Result of the ListDatasetImportJobs operation returned by the service. - `com.amazonaws.services.personalize.model.ListDatasetImportJobsResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.ListDatasetImportJobsResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.ListDatasetImportJobsRequest list-dataset-import-jobs-request]
    (-> this (.listDatasetImportJobs list-dataset-import-jobs-request))))

(defn create-solution-version
  "Trains or retrains an active solution. A solution is created using the CreateSolution operation and must
   be in the ACTIVE state before calling CreateSolutionVersion. A new version of the solution is
   created every time you call this operation.


   Status


   A solution version can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   To get the status of the version, call DescribeSolutionVersion. Wait until the status shows as ACTIVE
   before calling CreateCampaign.


   If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why
   the job failed.


   Related APIs




   ListSolutionVersions




   DescribeSolutionVersion






   ListSolutions




   CreateSolution




   DescribeSolution




   DeleteSolution

  create-solution-version-request - `com.amazonaws.services.personalize.model.CreateSolutionVersionRequest`

  returns: Result of the CreateSolutionVersion operation returned by the service. - `com.amazonaws.services.personalize.model.CreateSolutionVersionResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.CreateSolutionVersionResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateSolutionVersionRequest create-solution-version-request]
    (-> this (.createSolutionVersion create-solution-version-request))))

(defn describe-solution-version
  "Describes a specific version of a solution. For more information on solutions, see CreateSolution.

  describe-solution-version-request - `com.amazonaws.services.personalize.model.DescribeSolutionVersionRequest`

  returns: Result of the DescribeSolutionVersion operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeSolutionVersionResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DescribeSolutionVersionResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeSolutionVersionRequest describe-solution-version-request]
    (-> this (.describeSolutionVersion describe-solution-version-request))))

(defn create-dataset
  "Creates an empty dataset and adds it to the specified dataset group. Use CreateDatasetImportJob to import
   your training data to a dataset.


   There are three types of datasets:




   Interactions




   Items




   Users




   Each dataset type has an associated schema with required field types. Only the Interactions dataset
   is required in order to train a model (also referred to as creating a solution).


   A dataset can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING > DELETE IN_PROGRESS




   To get the status of the dataset, call DescribeDataset.


   Related APIs




   CreateDatasetGroup




   ListDatasets




   DescribeDataset




   DeleteDataset

  create-dataset-request - `com.amazonaws.services.personalize.model.CreateDatasetRequest`

  returns: Result of the CreateDataset operation returned by the service. - `com.amazonaws.services.personalize.model.CreateDatasetResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.CreateDatasetResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateDatasetRequest create-dataset-request]
    (-> this (.createDataset create-dataset-request))))

(defn create-dataset-group
  "Creates an empty dataset group. A dataset group contains related datasets that supply data for training a model.
   A dataset group can contain at most three datasets, one for each type of dataset:




   Interactions




   Items




   Users




   To train a model (create a solution), a dataset group that contains an Interactions dataset is
   required. Call CreateDataset to add a dataset to the group.


   A dataset group can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING




   To get the status of the dataset group, call DescribeDatasetGroup. If the status shows as CREATE FAILED,
   the response includes a failureReason key, which describes why the creation failed.



   You must wait until the status of the dataset group is ACTIVE before adding a dataset
   to the group.



   You can specify an AWS Key Management Service (KMS) key to encrypt the datasets in the group. If you specify a
   KMS key, you must also include an AWS Identity and Access Management (IAM) role that has permission to access the
   key.


   APIs that require a dataset group ARN in the request




   CreateDataset




   CreateEventTracker




   CreateSolution




   Related APIs




   ListDatasetGroups




   DescribeDatasetGroup




   DeleteDatasetGroup

  create-dataset-group-request - `com.amazonaws.services.personalize.model.CreateDatasetGroupRequest`

  returns: Result of the CreateDatasetGroup operation returned by the service. - `com.amazonaws.services.personalize.model.CreateDatasetGroupResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.CreateDatasetGroupResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateDatasetGroupRequest create-dataset-group-request]
    (-> this (.createDatasetGroup create-dataset-group-request))))

(defn create-event-tracker
  "Creates an event tracker that you use when sending event data to the specified dataset group using the PutEvents API.


   When Amazon Personalize creates an event tracker, it also creates an event-interactions dataset in the
   dataset group associated with the event tracker. The event-interactions dataset stores the event data from the
   PutEvents call. The contents of this dataset are not available to the user.



   Only one event tracker can be associated with a dataset group. You will get an error if you call
   CreateEventTracker using the same dataset group as an existing event tracker.



   When you send event data you include your tracking ID. The tracking ID identifies the customer and authorizes the
   customer to send the data.


   The event tracker can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING > DELETE IN_PROGRESS




   To get the status of the event tracker, call DescribeEventTracker.



   The event tracker must be in the ACTIVE state before using the tracking ID.



   Related APIs




   ListEventTrackers




   DescribeEventTracker




   DeleteEventTracker

  create-event-tracker-request - `com.amazonaws.services.personalize.model.CreateEventTrackerRequest`

  returns: Result of the CreateEventTracker operation returned by the service. - `com.amazonaws.services.personalize.model.CreateEventTrackerResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.CreateEventTrackerResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateEventTrackerRequest create-event-tracker-request]
    (-> this (.createEventTracker create-event-tracker-request))))

(defn get-solution-metrics
  "Gets the metrics for the specified solution version.

  get-solution-metrics-request - `com.amazonaws.services.personalize.model.GetSolutionMetricsRequest`

  returns: Result of the GetSolutionMetrics operation returned by the service. - `com.amazonaws.services.personalize.model.GetSolutionMetricsResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.GetSolutionMetricsResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.GetSolutionMetricsRequest get-solution-metrics-request]
    (-> this (.getSolutionMetrics get-solution-metrics-request))))

(defn describe-event-tracker
  "Describes an event tracker. The response includes the trackingId and status of the
   event tracker. For more information on event trackers, see CreateEventTracker.

  describe-event-tracker-request - `com.amazonaws.services.personalize.model.DescribeEventTrackerRequest`

  returns: Result of the DescribeEventTracker operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeEventTrackerResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DescribeEventTrackerResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeEventTrackerRequest describe-event-tracker-request]
    (-> this (.describeEventTracker describe-event-tracker-request))))

(defn describe-solution
  "Describes a solution. For more information on solutions, see CreateSolution.

  describe-solution-request - `com.amazonaws.services.personalize.model.DescribeSolutionRequest`

  returns: Result of the DescribeSolution operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeSolutionResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DescribeSolutionResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeSolutionRequest describe-solution-request]
    (-> this (.describeSolution describe-solution-request))))

(defn delete-campaign
  "Removes a campaign by deleting the solution deployment. The solution that the campaign is based on is not deleted
   and can be redeployed when needed. A deleted campaign can no longer be specified in a GetRecommendations
   request. For more information on campaigns, see CreateCampaign.

  delete-campaign-request - `com.amazonaws.services.personalize.model.DeleteCampaignRequest`

  returns: Result of the DeleteCampaign operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteCampaignResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DeleteCampaignResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteCampaignRequest delete-campaign-request]
    (-> this (.deleteCampaign delete-campaign-request))))

(defn describe-dataset
  "Describes the given dataset. For more information on datasets, see CreateDataset.

  describe-dataset-request - `com.amazonaws.services.personalize.model.DescribeDatasetRequest`

  returns: Result of the DescribeDataset operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeDatasetResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DescribeDatasetResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeDatasetRequest describe-dataset-request]
    (-> this (.describeDataset describe-dataset-request))))

(defn list-datasets
  "Returns the list of datasets contained in the given dataset group. The response provides the properties for each
   dataset, including the Amazon Resource Name (ARN). For more information on datasets, see CreateDataset.

  list-datasets-request - `com.amazonaws.services.personalize.model.ListDatasetsRequest`

  returns: Result of the ListDatasets operation returned by the service. - `com.amazonaws.services.personalize.model.ListDatasetsResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.ListDatasetsResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.ListDatasetsRequest list-datasets-request]
    (-> this (.listDatasets list-datasets-request))))

(defn create-dataset-import-job
  "Creates a job that imports training data from your data source (an Amazon S3 bucket) to an Amazon Personalize
   dataset. To allow Amazon Personalize to import the training data, you must specify an AWS Identity and Access
   Management (IAM) role that has permission to read from the data source.



   The dataset import job replaces any previous data in the dataset.



   Status


   A dataset import job can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   To get the status of the import job, call DescribeDatasetImportJob, providing the Amazon Resource Name
   (ARN) of the dataset import job. The dataset import is complete when the status shows as ACTIVE. If the status
   shows as CREATE FAILED, the response includes a failureReason key, which describes why the job
   failed.



   Importing takes time. You must wait until the status shows as ACTIVE before training a model using the dataset.



   Related APIs




   ListDatasetImportJobs




   DescribeDatasetImportJob

  create-dataset-import-job-request - `com.amazonaws.services.personalize.model.CreateDatasetImportJobRequest`

  returns: Result of the CreateDatasetImportJob operation returned by the service. - `com.amazonaws.services.personalize.model.CreateDatasetImportJobResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.CreateDatasetImportJobResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateDatasetImportJobRequest create-dataset-import-job-request]
    (-> this (.createDatasetImportJob create-dataset-import-job-request))))

(defn list-dataset-groups
  "Returns a list of dataset groups. The response provides the properties for each dataset group, including the
   Amazon Resource Name (ARN). For more information on dataset groups, see CreateDatasetGroup.

  list-dataset-groups-request - `com.amazonaws.services.personalize.model.ListDatasetGroupsRequest`

  returns: Result of the ListDatasetGroups operation returned by the service. - `com.amazonaws.services.personalize.model.ListDatasetGroupsResult`

  throws: com.amazonaws.services.personalize.model.InvalidNextTokenException - The token is not valid."
  (^com.amazonaws.services.personalize.model.ListDatasetGroupsResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.ListDatasetGroupsRequest list-dataset-groups-request]
    (-> this (.listDatasetGroups list-dataset-groups-request))))

(defn describe-campaign
  "Describes the given campaign, including its status.


   A campaign can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING > DELETE IN_PROGRESS




   When the status is CREATE FAILED, the response includes the failureReason
   key, which describes why.


   For more information on campaigns, see CreateCampaign.

  describe-campaign-request - `com.amazonaws.services.personalize.model.DescribeCampaignRequest`

  returns: Result of the DescribeCampaign operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeCampaignResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DescribeCampaignResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeCampaignRequest describe-campaign-request]
    (-> this (.describeCampaign describe-campaign-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonPersonalize this]
    (-> this (.shutdown))))

(defn describe-recipe
  "Describes a recipe.


   A recipe contains three items:




   An algorithm that trains a model.




   Hyperparameters that govern the training.




   Feature transformation information for modifying the input data before training.




   Amazon Personalize provides a set of predefined recipes. You specify a recipe when you create a solution with the
   CreateSolution API. CreateSolution trains a model by using the algorithm in the specified
   recipe and a training dataset. The solution, when deployed as a campaign, can provide recommendations using the
   GetRecommendations
   API.

  describe-recipe-request - `com.amazonaws.services.personalize.model.DescribeRecipeRequest`

  returns: Result of the DescribeRecipe operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeRecipeResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DescribeRecipeResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeRecipeRequest describe-recipe-request]
    (-> this (.describeRecipe describe-recipe-request))))

(defn describe-dataset-group
  "Describes the given dataset group. For more information on dataset groups, see CreateDatasetGroup.

  describe-dataset-group-request - `com.amazonaws.services.personalize.model.DescribeDatasetGroupRequest`

  returns: Result of the DescribeDatasetGroup operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeDatasetGroupResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DescribeDatasetGroupResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeDatasetGroupRequest describe-dataset-group-request]
    (-> this (.describeDatasetGroup describe-dataset-group-request))))

(defn delete-solution
  "Deletes all versions of a solution and the Solution object itself. Before deleting a solution, you
   must delete all campaigns based on the solution. To determine what campaigns are using the solution, call
   ListCampaigns and supply the Amazon Resource Name (ARN) of the solution. You can't delete a solution if an
   associated SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on
   solutions, see CreateSolution.

  delete-solution-request - `com.amazonaws.services.personalize.model.DeleteSolutionRequest`

  returns: Result of the DeleteSolution operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteSolutionResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DeleteSolutionResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteSolutionRequest delete-solution-request]
    (-> this (.deleteSolution delete-solution-request))))

(defn list-recipes
  "Returns a list of available recipes. The response provides the properties for each recipe, including the recipe's
   Amazon Resource Name (ARN).

  list-recipes-request - `com.amazonaws.services.personalize.model.ListRecipesRequest`

  returns: Result of the ListRecipes operation returned by the service. - `com.amazonaws.services.personalize.model.ListRecipesResult`

  throws: com.amazonaws.services.personalize.model.InvalidNextTokenException - The token is not valid."
  (^com.amazonaws.services.personalize.model.ListRecipesResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.ListRecipesRequest list-recipes-request]
    (-> this (.listRecipes list-recipes-request))))

(defn list-solution-versions
  "Returns a list of solution versions for the given solution. When a solution is not specified, all the solution
   versions associated with the account are listed. The response provides the properties for each solution version,
   including the Amazon Resource Name (ARN). For more information on solutions, see CreateSolution.

  list-solution-versions-request - `com.amazonaws.services.personalize.model.ListSolutionVersionsRequest`

  returns: Result of the ListSolutionVersions operation returned by the service. - `com.amazonaws.services.personalize.model.ListSolutionVersionsResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.ListSolutionVersionsResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.ListSolutionVersionsRequest list-solution-versions-request]
    (-> this (.listSolutionVersions list-solution-versions-request))))

(defn create-campaign
  "Creates a campaign by deploying a solution version. When a client calls the GetRecommendations
   and
   GetPersonalizedRanking APIs, a campaign is specified in the request.


   Minimum Provisioned TPS and Auto-Scaling


   A transaction is a single GetRecommendations or GetPersonalizedRanking call.
   Transactions per second (TPS) is the throughput and unit of billing for Amazon Personalize. The minimum
   provisioned TPS (minProvisionedTPS) specifies the baseline throughput provisioned by Amazon
   Personalize, and thus, the minimum billing charge. If your TPS increases beyond minProvisionedTPS,
   Amazon Personalize auto-scales the provisioned capacity up and down, but never below
   minProvisionedTPS, to maintain a 70% utilization. There's a short time delay while the capacity is
   increased that might cause loss of transactions. It's recommended to start with a low
   minProvisionedTPS, track your usage using Amazon CloudWatch metrics, and then increase the
   minProvisionedTPS as necessary.


   Status


   A campaign can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING > DELETE IN_PROGRESS




   To get the campaign status, call DescribeCampaign.



   Wait until the status of the campaign is ACTIVE before asking the campaign for
   recommendations.



   Related APIs




   ListCampaigns




   DescribeCampaign




   UpdateCampaign




   DeleteCampaign

  create-campaign-request - `com.amazonaws.services.personalize.model.CreateCampaignRequest`

  returns: Result of the CreateCampaign operation returned by the service. - `com.amazonaws.services.personalize.model.CreateCampaignResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.CreateCampaignResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateCampaignRequest create-campaign-request]
    (-> this (.createCampaign create-campaign-request))))

(defn create-solution
  "Creates the configuration for training a model. A trained model is known as a solution. After the configuration
   is created, you train the model (create a solution) by calling the CreateSolutionVersion operation. Every
   time you call CreateSolutionVersion, a new version of the solution is created.


   After creating a solution version, you check its accuracy by calling GetSolutionMetrics. When you are
   satisfied with the version, you deploy it using CreateCampaign. The campaign provides recommendations to a
   client through the GetRecommendations
   API.


   To train a model, Amazon Personalize requires training data and a recipe. The training data comes from the
   dataset group that you provide in the request. A recipe specifies the training algorithm and a feature
   transformation. You can specify one of the predefined recipes provided by Amazon Personalize. Alternatively, you
   can specify performAutoML and Amazon Personalize will analyze your data and select the optimum
   USER_PERSONALIZATION recipe for you.


   Status


   A solution can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING > DELETE IN_PROGRESS




   To get the status of the solution, call DescribeSolution. Wait until the status shows as ACTIVE before
   calling CreateSolutionVersion.


   Related APIs




   ListSolutions




   CreateSolutionVersion




   DescribeSolution




   DeleteSolution






   ListSolutionVersions




   DescribeSolutionVersion

  create-solution-request - `com.amazonaws.services.personalize.model.CreateSolutionRequest`

  returns: Result of the CreateSolution operation returned by the service. - `com.amazonaws.services.personalize.model.CreateSolutionResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.CreateSolutionResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateSolutionRequest create-solution-request]
    (-> this (.createSolution create-solution-request))))

(defn update-campaign
  "Updates a campaign by either deploying a new solution or changing the value of the campaign's
   minProvisionedTPS parameter.


   To update a campaign, the campaign status must be ACTIVE or CREATE FAILED. Check the campaign status using the
   DescribeCampaign API.



   You must wait until the status of the updated campaign is ACTIVE before asking the
   campaign for recommendations.



   For more information on campaigns, see CreateCampaign.

  update-campaign-request - `com.amazonaws.services.personalize.model.UpdateCampaignRequest`

  returns: Result of the UpdateCampaign operation returned by the service. - `com.amazonaws.services.personalize.model.UpdateCampaignResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.UpdateCampaignResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.UpdateCampaignRequest update-campaign-request]
    (-> this (.updateCampaign update-campaign-request))))

(defn create-schema
  "Creates an Amazon Personalize schema from the specified schema string. The schema you create must be in Avro JSON
   format.


   Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset type and has a set
   of required field and keywords. You specify a schema when you call CreateDataset.


   Related APIs




   ListSchemas




   DescribeSchema




   DeleteSchema

  create-schema-request - `com.amazonaws.services.personalize.model.CreateSchemaRequest`

  returns: Result of the CreateSchema operation returned by the service. - `com.amazonaws.services.personalize.model.CreateSchemaResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.CreateSchemaResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateSchemaRequest create-schema-request]
    (-> this (.createSchema create-schema-request))))

(defn describe-feature-transformation
  "Describes the given feature transformation.

  describe-feature-transformation-request - `com.amazonaws.services.personalize.model.DescribeFeatureTransformationRequest`

  returns: Result of the DescribeFeatureTransformation operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeFeatureTransformationResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DescribeFeatureTransformationResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeFeatureTransformationRequest describe-feature-transformation-request]
    (-> this (.describeFeatureTransformation describe-feature-transformation-request))))

(defn list-solutions
  "Returns a list of solutions that use the given dataset group. When a dataset group is not specified, all the
   solutions associated with the account are listed. The response provides the properties for each solution,
   including the Amazon Resource Name (ARN). For more information on solutions, see CreateSolution.

  list-solutions-request - `com.amazonaws.services.personalize.model.ListSolutionsRequest`

  returns: Result of the ListSolutions operation returned by the service. - `com.amazonaws.services.personalize.model.ListSolutionsResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.ListSolutionsResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.ListSolutionsRequest list-solutions-request]
    (-> this (.listSolutions list-solutions-request))))

(defn describe-dataset-import-job
  "Describes the dataset import job created by CreateDatasetImportJob, including the import job status.

  describe-dataset-import-job-request - `com.amazonaws.services.personalize.model.DescribeDatasetImportJobRequest`

  returns: Result of the DescribeDatasetImportJob operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeDatasetImportJobResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DescribeDatasetImportJobResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeDatasetImportJobRequest describe-dataset-import-job-request]
    (-> this (.describeDatasetImportJob describe-dataset-import-job-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonPersonalize this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-event-tracker
  "Deletes the event tracker. Does not delete the event-interactions dataset from the associated dataset group. For
   more information on event trackers, see CreateEventTracker.

  delete-event-tracker-request - `com.amazonaws.services.personalize.model.DeleteEventTrackerRequest`

  returns: Result of the DeleteEventTracker operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteEventTrackerResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DeleteEventTrackerResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteEventTrackerRequest delete-event-tracker-request]
    (-> this (.deleteEventTracker delete-event-tracker-request))))

(defn delete-dataset
  "Deletes a dataset. You can't delete a dataset if an associated DatasetImportJob or
   SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on datasets, see
   CreateDataset.

  delete-dataset-request - `com.amazonaws.services.personalize.model.DeleteDatasetRequest`

  returns: Result of the DeleteDataset operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteDatasetResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DeleteDatasetResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteDatasetRequest delete-dataset-request]
    (-> this (.deleteDataset delete-dataset-request))))

(defn delete-schema
  "Deletes a schema. Before deleting a schema, you must delete all datasets referencing the schema. For more
   information on schemas, see CreateSchema.

  delete-schema-request - `com.amazonaws.services.personalize.model.DeleteSchemaRequest`

  returns: Result of the DeleteSchema operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteSchemaResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DeleteSchemaResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteSchemaRequest delete-schema-request]
    (-> this (.deleteSchema delete-schema-request))))

(defn delete-dataset-group
  "Deletes a dataset group. Before you delete a dataset group, you must delete the following:




   All associated event trackers.




   All associated solutions.




   All datasets in the dataset group.

  delete-dataset-group-request - `com.amazonaws.services.personalize.model.DeleteDatasetGroupRequest`

  returns: Result of the DeleteDatasetGroup operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteDatasetGroupResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.DeleteDatasetGroupResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteDatasetGroupRequest delete-dataset-group-request]
    (-> this (.deleteDatasetGroup delete-dataset-group-request))))

(defn list-campaigns
  "Returns a list of campaigns that use the given solution. When a solution is not specified, all the campaigns
   associated with the account are listed. The response provides the properties for each campaign, including the
   Amazon Resource Name (ARN). For more information on campaigns, see CreateCampaign.

  list-campaigns-request - `com.amazonaws.services.personalize.model.ListCampaignsRequest`

  returns: Result of the ListCampaigns operation returned by the service. - `com.amazonaws.services.personalize.model.ListCampaignsResult`

  throws: com.amazonaws.services.personalize.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalize.model.ListCampaignsResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.ListCampaignsRequest list-campaigns-request]
    (-> this (.listCampaigns list-campaigns-request))))

(defn list-schemas
  "Returns the list of schemas associated with the account. The response provides the properties for each schema,
   including the Amazon Resource Name (ARN). For more information on schemas, see CreateSchema.

  list-schemas-request - `com.amazonaws.services.personalize.model.ListSchemasRequest`

  returns: Result of the ListSchemas operation returned by the service. - `com.amazonaws.services.personalize.model.ListSchemasResult`

  throws: com.amazonaws.services.personalize.model.InvalidNextTokenException - The token is not valid."
  (^com.amazonaws.services.personalize.model.ListSchemasResult [^AmazonPersonalize this ^com.amazonaws.services.personalize.model.ListSchemasRequest list-schemas-request]
    (-> this (.listSchemas list-schemas-request))))

