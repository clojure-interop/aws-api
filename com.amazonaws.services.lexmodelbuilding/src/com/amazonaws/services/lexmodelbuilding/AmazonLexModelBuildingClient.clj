(ns com.amazonaws.services.lexmodelbuilding.AmazonLexModelBuildingClient
  "Client for accessing Amazon Lex Model Building Service. All service calls made using this client are blocking, and
  will not return until the service call completes.

  Amazon Lex Build-Time Actions

  Amazon Lex is an AWS service for building conversational voice and text interfaces. Use these actions to create,
  update, and delete conversational bots for new and existing client applications."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lexmodelbuilding AmazonLexModelBuildingClient]))

(defn *builder
  "returns: `com.amazonaws.services.lexmodelbuilding.AmazonLexModelBuildingClientBuilder`"
  (^com.amazonaws.services.lexmodelbuilding.AmazonLexModelBuildingClientBuilder []
    (AmazonLexModelBuildingClient/builder )))

(defn delete-slot-type
  "Deletes all versions of the slot type, including the $LATEST version. To delete a specific version
   of the slot type, use the DeleteSlotTypeVersion operation.


   You can delete a version of a slot type only if it is not referenced. To delete a slot type that is referred to
   in one or more intents, you must remove those references first.



   If you get the ResourceInUseException exception, the exception provides an example reference that
   shows the intent where the slot type is referenced. To remove the reference to the slot type, either update the
   intent or delete it. If you get the same exception when you attempt to delete the slot type again, repeat until
   the slot type has no references and the DeleteSlotType call is successful.



   This operation requires permission for the lex:DeleteSlotType action.

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest`

  returns: Result of the DeleteSlotType operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest request]
    (-> this (.deleteSlotType request))))

(defn start-import
  "Starts a job to import a resource to Amazon Lex.

  request - `com.amazonaws.services.lexmodelbuilding.model.StartImportRequest`

  returns: Result of the StartImport operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.StartImportResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.LimitExceededException - The request exceeded a limit. Try your request again."
  (^com.amazonaws.services.lexmodelbuilding.model.StartImportResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.StartImportRequest request]
    (-> this (.startImport request))))

(defn get-builtin-intent
  "Returns information about a built-in intent.


   This operation requires permission for the lex:GetBuiltinIntent action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest`

  returns: Result of the GetBuiltinIntent operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest request]
    (-> this (.getBuiltinIntent request))))

(defn get-bot-alias
  "Returns information about an Amazon Lex bot alias. For more information about aliases, see
   versioning-aliases.


   This operation requires permissions for the lex:GetBotAlias action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest`

  returns: Result of the GetBotAlias operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest request]
    (-> this (.getBotAlias request))))

(defn get-slot-type
  "Returns information about a specific version of a slot type. In addition to specifying the slot type name, you
   must specify the slot type version.


   This operation requires permissions for the lex:GetSlotType action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest`

  returns: Result of the GetSlotType operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest request]
    (-> this (.getSlotType request))))

(defn get-utterances-view
  "Use the GetUtterancesView operation to get information about the utterances that your users have
   made to your bot. You can use this list to tune the utterances that your bot responds to.


   For example, say that you have created a bot to order flowers. After your users have used your bot for a while,
   use the GetUtterancesView operation to see the requests that they have made and whether they have
   been successful. You might find that the utterance \"I want flowers\" is not being recognized. You could add this
   utterance to the OrderFlowers intent so that your bot recognizes that utterance.


   After you publish a new version of a bot, you can get information about the old version and the new so that you
   can compare the performance across the two versions.



   Utterance statistics are generated once a day. Data is available for the last 15 days. You can request
   information for up to 5 versions in each request. The response contains information about a maximum of 100
   utterances for each version.



   This operation requires permissions for the lex:GetUtterancesView action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest`

  returns: Result of the GetUtterancesView operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.LimitExceededException - The request exceeded a limit. Try your request again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest request]
    (-> this (.getUtterancesView request))))

(defn put-bot
  "Creates an Amazon Lex conversational bot or replaces an existing bot. When you create or update a bot you are
   only required to specify a name, a locale, and whether the bot is directed toward children under age 13. You can
   use this to add intents later, or to remove intents from an existing bot. When you create a bot with the minimum
   information, the bot is created or updated but Amazon Lex returns the  response FAILED. You
   can build the bot after you add one or more intents. For more information about Amazon Lex bots, see
   how-it-works.


   If you specify the name of an existing bot, the fields in the request replace the existing values in the
   $LATEST version of the bot. Amazon Lex removes any fields that you don't provide values for in the
   request, except for the idleTTLInSeconds and privacySettings fields, which are set to
   their default values. If you don't specify values for required fields, Amazon Lex throws an exception.


   This operation requires permissions for the lex:PutBot action. For more information, see
   auth-and-access-control.

  request - `com.amazonaws.services.lexmodelbuilding.model.PutBotRequest`

  returns: Result of the PutBot operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.PutBotResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.ConflictException - There was a conflict processing the request. Try your request again."
  (^com.amazonaws.services.lexmodelbuilding.model.PutBotResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.PutBotRequest request]
    (-> this (.putBot request))))

(defn get-bot
  "Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.


   This operation requires permissions for the lex:GetBot action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotRequest`

  returns: Result of the GetBot operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetBotRequest request]
    (-> this (.getBot request))))

(defn get-builtin-slot-types
  "Gets a list of built-in slot types that meet the specified criteria.


   For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit.


   This operation requires permission for the lex:GetBuiltInSlotTypes action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest`

  returns: Result of the GetBuiltinSlotTypes operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.LimitExceededException - The request exceeded a limit. Try your request again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest request]
    (-> this (.getBuiltinSlotTypes request))))

(defn create-bot-version
  "Creates a new version of the bot based on the $LATEST version. If the $LATEST version
   of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version. It
   returns the last created version.



   You can update only the $LATEST version of the bot. You can't update the numbered versions that you
   create with the CreateBotVersion operation.



   When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
   For more information, see versioning-intro.


   This operation requires permission for the lex:CreateBotVersion action.

  request - `com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest`

  returns: Result of the CreateBotVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest request]
    (-> this (.createBotVersion request))))

(defn get-bot-versions
  "Gets information about all of the versions of a bot.


   The GetBotVersions operation returns a BotMetadata object for each version of a bot.
   For example, if a bot has three numbered versions, the GetBotVersions operation returns four
   BotMetadata objects in the response, one for each numbered version and one for the
   $LATEST version.


   The GetBotVersions operation always returns at least one version, the $LATEST version.


   This operation requires permissions for the lex:GetBotVersions action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest`

  returns: Result of the GetBotVersions operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest request]
    (-> this (.getBotVersions request))))

(defn get-export
  "Exports the contents of a Amazon Lex resource in a specified format.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetExportRequest`

  returns: Result of the GetExport operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetExportResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetExportResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetExportRequest request]
    (-> this (.getExport request))))

(defn delete-intent-version
  "Deletes a specific version of an intent. To delete all versions of a intent, use the DeleteIntent
   operation.


   This operation requires permissions for the lex:DeleteIntentVersion action.

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest`

  returns: Result of the DeleteIntentVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest request]
    (-> this (.deleteIntentVersion request))))

(defn get-bot-channel-associations
  "Returns a list of all of the channels associated with the specified bot.


   The GetBotChannelAssociations operation requires permissions for the
   lex:GetBotChannelAssociations action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest`

  returns: Result of the GetBotChannelAssociations operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.LimitExceededException - The request exceeded a limit. Try your request again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest request]
    (-> this (.getBotChannelAssociations request))))

(defn get-slot-types
  "Returns slot type information as follows:




   If you specify the nameContains field, returns the $LATEST version of all slot types
   that contain the specified string.




   If you don't specify the nameContains field, returns information about the $LATEST
   version of all slot types.




   The operation requires permission for the lex:GetSlotTypes action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest`

  returns: Result of the GetSlotTypes operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest request]
    (-> this (.getSlotTypes request))))

(defn get-intent
  "Returns information about an intent. In addition to the intent name, you must specify the intent version.


   This operation requires permissions to perform the lex:GetIntent action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest`

  returns: Result of the GetIntent operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetIntentResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetIntentResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest request]
    (-> this (.getIntent request))))

(defn create-intent-version
  "Creates a new version of an intent based on the $LATEST version of the intent. If the
   $LATEST version of this intent hasn't changed since you last updated it, Amazon Lex doesn't create a
   new version. It returns the last version you created.



   You can update only the $LATEST version of the intent. You can't update the numbered versions that
   you create with the CreateIntentVersion operation.



   When you create a version of an intent, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For
   more information, see versioning-intro.


   This operation requires permissions to perform the lex:CreateIntentVersion action.

  request - `com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest`

  returns: Result of the CreateIntentVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest request]
    (-> this (.createIntentVersion request))))

(defn get-intents
  "Returns intent information as follows:




   If you specify the nameContains field, returns the $LATEST version of all intents that
   contain the specified string.




   If you don't specify the nameContains field, returns information about the $LATEST
   version of all intents.




   The operation requires permission for the lex:GetIntents action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest`

  returns: Result of the GetIntents operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest request]
    (-> this (.getIntents request))))

(defn put-slot-type
  "Creates a custom slot type or replaces an existing custom slot type.


   To create a custom slot type, specify a name for the slot type and a set of enumeration values, which are the
   values that a slot of this type can assume. For more information, see how-it-works.


   If you specify the name of an existing slot type, the fields in the request replace the existing values in the
   $LATEST version of the slot type. Amazon Lex removes the fields that you don't provide in the
   request. If you don't specify required fields, Amazon Lex throws an exception. When you update the
   $LATEST version of a slot type, if a bot uses the $LATEST version of an intent that
   contains the slot type, the bot's status field is set to NOT_BUILT.


   This operation requires permissions for the lex:PutSlotType action.

  request - `com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest`

  returns: Result of the PutSlotType operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.ConflictException - There was a conflict processing the request. Try your request again."
  (^com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest request]
    (-> this (.putSlotType request))))

(defn get-bot-aliases
  "Returns a list of aliases for a specified Amazon Lex bot.


   This operation requires permissions for the lex:GetBotAliases action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest`

  returns: Result of the GetBotAliases operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.LimitExceededException - The request exceeded a limit. Try your request again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest request]
    (-> this (.getBotAliases request))))

(defn get-bots
  "Returns bot information as follows:




   If you provide the nameContains field, the response includes information for the
   $LATEST version of all bots whose name contains the specified string.




   If you don't specify the nameContains field, the operation returns information about the
   $LATEST version of all of your bots.




   This operation requires permission for the lex:GetBots action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest`

  returns: Result of the GetBots operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotsResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotsResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest request]
    (-> this (.getBots request))))

(defn get-intent-versions
  "Gets information about all of the versions of an intent.


   The GetIntentVersions operation returns an IntentMetadata object for each version of an
   intent. For example, if an intent has three numbered versions, the GetIntentVersions operation
   returns four IntentMetadata objects in the response, one for each numbered version and one for the
   $LATEST version.


   The GetIntentVersions operation always returns at least one version, the $LATEST
   version.


   This operation requires permissions for the lex:GetIntentVersions action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest`

  returns: Result of the GetIntentVersions operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest request]
    (-> this (.getIntentVersions request))))

(defn put-intent
  "Creates an intent or replaces an existing intent.


   To define the interaction between the user and your bot, you use one or more intents. For a pizza ordering bot,
   for example, you would create an OrderPizza intent.


   To create an intent or replace an existing intent, you must provide the following:




   Intent name. For example, OrderPizza.




   Sample utterances. For example, \"Can I order a pizza, please.\" and \"I want to order a pizza.\"




   Information to be gathered. You specify slot types for the information that your bot will request from the user.
   You can specify standard slot types, such as a date or a time, or custom slot types such as the size and crust of
   a pizza.




   How the intent will be fulfilled. You can provide a Lambda function or configure the intent to return the intent
   information to the client application. If you use a Lambda function, when all of the intent information is
   available, Amazon Lex invokes your Lambda function. If you configure your intent to return the intent information
   to the client application.




   You can specify other optional information in the request, such as:




   A confirmation prompt to ask the user to confirm an intent. For example, \"Shall I order your pizza?\"




   A conclusion statement to send to the user after the intent has been fulfilled. For example,
   \"I placed your pizza order.\"




   A follow-up prompt that asks the user for additional activity. For example, asking
   \"Do you want to order a drink with your pizza?\"




   If you specify an existing intent name to update the intent, Amazon Lex replaces the values in the
   $LATEST version of the intent with the values in the request. Amazon Lex removes fields that you
   don't provide in the request. If you don't specify the required fields, Amazon Lex throws an exception. When you
   update the $LATEST version of an intent, the status field of any bot that uses the
   $LATEST version of the intent is set to NOT_BUILT.


   For more information, see how-it-works.


   This operation requires permissions for the lex:PutIntent action.

  request - `com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest`

  returns: Result of the PutIntent operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.PutIntentResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.ConflictException - There was a conflict processing the request. Try your request again."
  (^com.amazonaws.services.lexmodelbuilding.model.PutIntentResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest request]
    (-> this (.putIntent request))))

(defn delete-slot-type-version
  "Deletes a specific version of a slot type. To delete all versions of a slot type, use the DeleteSlotType
   operation.


   This operation requires permissions for the lex:DeleteSlotTypeVersion action.

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest`

  returns: Result of the DeleteSlotTypeVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest request]
    (-> this (.deleteSlotTypeVersion request))))

(defn delete-utterances
  "Deletes stored utterances.


   Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the
   GetUtterancesView operation, and then stored indefinitely for use in improving the ability of your bot to
   respond to user input.


   Use the DeleteStoredUtterances operation to manually delete stored utterances for a specific user.


   This operation requires permissions for the lex:DeleteUtterances action.

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest`

  returns: Result of the DeleteUtterances operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest request]
    (-> this (.deleteUtterances request))))

(defn get-bot-channel-association
  "Returns information about the association between an Amazon Lex bot and a messaging platform.


   This operation requires permissions for the lex:GetBotChannelAssociation action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest`

  returns: Result of the GetBotChannelAssociation operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest request]
    (-> this (.getBotChannelAssociation request))))

(defn delete-bot
  "Deletes all versions of the bot, including the $LATEST version. To delete a specific version of the
   bot, use the DeleteBotVersion operation.


   If a bot has an alias, you can't delete it. Instead, the DeleteBot operation returns a
   ResourceInUseException exception that includes a reference to the alias that refers to the bot. To
   remove the reference to the bot, delete the alias. If you get the same exception again, delete the referring
   alias until the DeleteBot operation is successful.


   This operation requires permissions for the lex:DeleteBot action.

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest`

  returns: Result of the DeleteBot operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest request]
    (-> this (.deleteBot request))))

(defn delete-bot-version
  "Deletes a specific version of a bot. To delete all versions of a bot, use the DeleteBot operation.


   This operation requires permissions for the lex:DeleteBotVersion action.

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest`

  returns: Result of the DeleteBotVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest request]
    (-> this (.deleteBotVersion request))))

(defn delete-intent
  "Deletes all versions of the intent, including the $LATEST version. To delete a specific version of
   the intent, use the DeleteIntentVersion operation.


   You can delete a version of an intent only if it is not referenced. To delete an intent that is referred to in
   one or more bots (see how-it-works), you must remove those references first.



   If you get the ResourceInUseException exception, it provides an example reference that shows where
   the intent is referenced. To remove the reference to the intent, either update the bot or delete it. If you get
   the same exception when you attempt to delete the intent again, repeat until the intent has no references and the
   call to DeleteIntent is successful.



   This operation requires permission for the lex:DeleteIntent action.

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest`

  returns: Result of the DeleteIntent operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest request]
    (-> this (.deleteIntent request))))

(defn get-import
  "Gets information about an import job started with the StartImport operation.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetImportRequest`

  returns: Result of the GetImport operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetImportResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetImportResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetImportRequest request]
    (-> this (.getImport request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonLexModelBuildingClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-builtin-intents
  "Gets a list of built-in intents that meet the specified criteria.


   This operation requires permission for the lex:GetBuiltinIntents action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest`

  returns: Result of the GetBuiltinIntents operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.LimitExceededException - The request exceeded a limit. Try your request again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest request]
    (-> this (.getBuiltinIntents request))))

(defn create-slot-type-version
  "Creates a new version of a slot type based on the $LATEST version of the specified slot type. If the
   $LATEST version of this resource has not changed since the last version that you created, Amazon Lex
   doesn't create a new version. It returns the last version that you created.



   You can update only the $LATEST version of a slot type. You can't update the numbered versions that
   you create with the CreateSlotTypeVersion operation.



   When you create a version of a slot type, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
   For more information, see versioning-intro.


   This operation requires permissions for the lex:CreateSlotTypeVersion action.

  request - `com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest`

  returns: Result of the CreateSlotTypeVersion operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest request]
    (-> this (.createSlotTypeVersion request))))

(defn put-bot-alias
  "Creates an alias for the specified version of the bot or replaces an alias for the specified bot. To change the
   version of the bot that the alias points to, replace the alias. For more information about aliases, see
   versioning-aliases.


   This operation requires permissions for the lex:PutBotAlias action.

  request - `com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest`

  returns: Result of the PutBotAlias operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.ConflictException - There was a conflict processing the request. Try your request again."
  (^com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest request]
    (-> this (.putBotAlias request))))

(defn delete-bot-alias
  "Deletes an alias for the specified bot.


   You can't delete an alias that is used in the association between a bot and a messaging channel. If an alias is
   used in a channel association, the DeleteBot operation returns a ResourceInUseException
   exception that includes a reference to the channel association that refers to the bot. You can remove the
   reference to the alias by deleting the channel association. If you get the same exception again, delete the
   referring association until the DeleteBotAlias operation is successful.

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest`

  returns: Result of the DeleteBotAlias operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest request]
    (-> this (.deleteBotAlias request))))

(defn get-slot-type-versions
  "Gets information about all versions of a slot type.


   The GetSlotTypeVersions operation returns a SlotTypeMetadata object for each version of
   a slot type. For example, if a slot type has three numbered versions, the GetSlotTypeVersions
   operation returns four SlotTypeMetadata objects in the response, one for each numbered version and
   one for the $LATEST version.


   The GetSlotTypeVersions operation always returns at least one version, the $LATEST
   version.


   This operation requires permissions for the lex:GetSlotTypeVersions action.

  request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest`

  returns: Result of the GetSlotTypeVersions operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest request]
    (-> this (.getSlotTypeVersions request))))

(defn delete-bot-channel-association
  "Deletes the association between an Amazon Lex bot and a messaging platform.


   This operation requires permission for the lex:DeleteBotChannelAssociation action.

  request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest`

  returns: Result of the DeleteBotChannelAssociation operation returned by the service. - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult`

  throws: com.amazonaws.services.lexmodelbuilding.model.NotFoundException - The resource specified in the request was not found. Check the resource and try again."
  (^com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult [^AmazonLexModelBuildingClient this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest request]
    (-> this (.deleteBotChannelAssociation request))))

