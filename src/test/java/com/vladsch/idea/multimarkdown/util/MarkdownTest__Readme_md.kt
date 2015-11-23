

/*
 * Copyright (c) 2015-2015 Vladimir Schneider <vladimir.schneider@gmail.com>, all rights reserved.
 *
 * This code is private property of the copyright holder and cannot be used without
 * having obtained a license or prior written permission of the of the copyright holder.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package com.vladsch.idea.multimarkdown.util

import com.vladsch.idea.multimarkdown.printData

// Auto-generated test data from: /Users/vlad/src/MarkdownTest/Readme.md

class MarkdownTest__Readme_md {
    companion object {
        //@Parameterized.Parameters(name = "{index}: filePath = {0}, linkRef = {3}, linkAnchor = {4}")
        @JvmStatic
        fun data(): Collection<Array<Any?>> {

            val cleanData = false
            val data = arrayListOf<Array<Any?>>(
                /* @formatter:off */
                /*      arrayOf<Any?>("fullPath"                              , "linkType"    , "linkText"                         , "linkRef"                                                                , "linkAnchor" , "linkTitle", "resolvesLocal"                                           , "resolvesRemote"                                      , "linkAddress"                                      , "remoteAddress"  , "multiResolve") */
                /*  0 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::WikiLinkRef , ""                                 , "Wiki Link"                                                              , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /*  0 */,
                /*  1 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::WikiLinkRef , ""                                 , "Home"                                                                   , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("MarkdownTest.wiki/Home.md")) /*  1 */,
                /*  2 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "not relative link"                , "https://notchecked"                                                     , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /*  2 */,
                /*  3 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "not relative link"                , "http://notchecked"                                                      , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /*  3 */,
                /*  4 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "not relative link"                , "ftp://notchecked"                                                       , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /*  4 */,
                /*  5 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "not relative link"                , "mailto:test@notchecked"                                                 , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /*  5 */,
                /*  6 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "not relative link with anchor"    , ""                                                                       , "not-checked", null       , "Readme.md"                                               , "Readme.md"                                           , "#not-checked"                                     , null             , arrayOf<String>("Readme.md")) /*  6 */,
                /*  7 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Missing Link"                     , "Missing-File"                                                           , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /*  7 */,
                /*  8 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Non Wiki File"                    , "NonWikiFile.md"                                                         , null         , null       , "NonWikiFile.md"                                          , "NonWikiFile.md"                                      , "NonWikiFile.md"                                   , null             , arrayOf<String>()) /*  8 */,
                /*  9 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Link to self"                     , "Readme.md"                                                              , null         , null       , "Readme.md"                                               , "Readme.md"                                           , "#"                                                , null             , arrayOf<String>("GitHubIssues/Issue-46/webbeheer_package/bower_components/autoNumeric/autoNumeric-2.0/readme.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/autoNumeric/readme.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-datepicker/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-datepicker/docs/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-datepicker/tests/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-daterangepicker/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-modal/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-sass/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/cropper/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/eonasdan-bootstrap-datetimepicker/README.md", "Readme.md", "untitled/README.md")) /*  9 */,
                /* 10 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Link to self"                     , "Readme.md"                                                              , "test"       , null       , "Readme.md"                                               , "Readme.md"                                           , "#test"                                            , null             , arrayOf<String>("GitHubIssues/Issue-46/webbeheer_package/bower_components/autoNumeric/autoNumeric-2.0/readme.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/autoNumeric/readme.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-datepicker/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-datepicker/docs/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-datepicker/tests/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-daterangepicker/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-modal/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap-sass/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/bootstrap/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/cropper/README.md", "GitHubIssues/Issue-46/webbeheer_package/bower_components/eonasdan-bootstrap-datetimepicker/README.md", "Readme.md", "untitled/README.md")) /* 10 */,
                /* 11 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Non Wiki File with anchor"        , "NonWikiFile.md"                                                         , "testing"    , null       , "NonWikiFile.md"                                          , "NonWikiFile.md"                                      , "NonWikiFile.md#testing"                           , null             , arrayOf<String>()) /* 11 */,
                /* 12 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Sub Directory VCS Nested File"    , "SubDirectory/NestedFile.md"                                             , null         , null       , "SubDirectory/NestedFile.md"                              , "SubDirectory/NestedFile.md"                          , "SubDirectory/NestedFile.md"                       , null             , arrayOf<String>()) /* 12 */,
                /* 13 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Sub Directory Non VCS Nested File", "SubDirectory/NonVcsNestedFile.md"                                       , null         , null       , "SubDirectory/NonVcsNestedFile.md"                        , "SubDirectory/NonVcsNestedFile.md"                    , "SubDirectory/NonVcsNestedFile.md"                 , null             , arrayOf<String>()) /* 13 */,
                /* 14 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Non Wiki File"                    , "nonwikifile.md"                                                         , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("NonWikiFile.md")) /* 14 */,
                /* 15 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Non Wiki File"                    , "NONWIKIFILE.md"                                                         , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("NonWikiFile.md")) /* 15 */,
                /* 16 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Sub Directory VCS Nested File"    , "subDirectory/NestedFile.md"                                             , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("SubDirectory/NestedFile.md")) /* 16 */,
                /* 17 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Sub Directory Non Vcs Nested File", "subDirectory/NonVcsNestedFile.md"                                       , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("SubDirectory/NonVcsNestedFile.md")) /* 17 */,
                /* 18 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Anchor in Name"                   , "anchor-in-name"                                                         , "5"          , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /* 18 */,
                /* 19 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Anchor in Name"                   , "anchor-in-name"                                                         , "5.md"       , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /* 19 */,
                /* 20 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Anchor in Name"                   , "anchor-in-name%235.md"                                                  , null         , null       , "anchor-in-name#5.md"                                     , "anchor-in-name#5.md"                                 , "anchor-in-name%235.md"                            , null             , arrayOf<String>("MarkdownTest.wiki/anchor-in-name#5.md", "anchor-in-name#5.md")) /* 20 */,
                /* 21 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Anchor in Name"                   , "anchor-in-name%235.md"                                                  , "5"          , null       , "anchor-in-name#5.md"                                     , "anchor-in-name#5.md"                                 , "anchor-in-name%235.md#5"                          , null             , arrayOf<String>("MarkdownTest.wiki/anchor-in-name#5.md", "anchor-in-name#5.md")) /* 21 */,
                /* 22 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::ImageLinkRef, "Translation Manager Screenshot"   , "../../wiki/images/ScreenShot_main.png"                                  , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /* 22 */,
                /* 23 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "clone"                            , "github-windows://openRepo/https://github.com/kriasoft/react-starter-kit", null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /* 23 */,
                /* 24 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "fork"                             , "https://github.com/kriasoft/react-starter-kit/fork"                     , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /* 24 */,
                /* 25 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Non Wiki File"                    , "NonWikiFile"                                                            , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("NonWikiFile.md")) /* 25 */,
                /* 26 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Sub Directory VCS Nested File"    , "SubDirectory/NestedFile"                                                , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("SubDirectory/NestedFile.md")) /* 26 */,
                /* 27 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Non Wiki File"                    , "nonwikifile"                                                            , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("NonWikiFile.md")) /* 27 */,
                /* 28 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Non Wiki File"                    , "NONWIKIFILe"                                                            , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("NonWikiFile.md")) /* 28 */,
                /* 29 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Sub Directory VCS Nested File"    , "SubDirectory/NestedFile"                                                , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("SubDirectory/NestedFile.md")) /* 29 */,
                /* 30 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Sub Directory Non Vcs Nested File", "SubDirectory/NonVcsNestedFile"                                          , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("SubDirectory/NonVcsNestedFile.md")) /* 30 */,
                /* 31 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Sub Directory Nested File"        , "NestedFile"                                                             , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("SubDirectory/NestedFile.md")) /* 31 */,
                /* 32 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Graphs"                           , "../../graphs"                                                           , null         , null       , null                                                      , "https://github.com/vsch/MarkdownTest/graphs"         , null                                               , "../../graphs"   , arrayOf<String>()) /* 32 */,
                /* 33 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Issues"                           , "../../issues"                                                           , null         , null       , null                                                      , "https://github.com/vsch/MarkdownTest/issues"         , null                                               , "../../issues"   , arrayOf<String>()) /* 33 */,
                /* 34 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Pulls"                            , "../../pulls"                                                            , null         , null       , null                                                      , "https://github.com/vsch/MarkdownTest/pulls"          , null                                               , "../../pulls"    , arrayOf<String>()) /* 34 */,
                /* 35 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Pulse"                            , "../../pulse"                                                            , null         , null       , null                                                      , "https://github.com/vsch/MarkdownTest/pulse"          , null                                               , "../../pulse"    , arrayOf<String>()) /* 35 */,
                /* 36 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Wiki"                             , "../../wiki"                                                             , null         , null       , "MarkdownTest.wiki/Home.md"                               , "MarkdownTest.wiki/Home.md"                           , "../../wiki"                                       , null             , arrayOf<String>()) /* 36 */,
                /* 37 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Wiki Home"                        , "../../wiki/Home"                                                        , null         , null       , "MarkdownTest.wiki/Home.md"                               , "MarkdownTest.wiki/Home.md"                           , "../../wiki"                                       , null             , arrayOf<String>()) /* 37 */,
                /* 38 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Wiki Home"                        , "../../wiki/Home"                                                        , "test"       , null       , "MarkdownTest.wiki/Home.md"                               , "MarkdownTest.wiki/Home.md"                           , "../../wiki#test"                                  , null             , arrayOf<String>()) /* 38 */,
                /* 39 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Wiki Home"                        , "../../wiki/normal-file"                                                 , null         , null       , "MarkdownTest.wiki/normal-file.md"                        , "MarkdownTest.wiki/normal-file.md"                    , "../../wiki/normal-file"                           , null             , arrayOf<String>()) /* 39 */,
                /* 40 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Wiki Home"                        , "../../wiki/normal-file"                                                 , "test"       , null       , "MarkdownTest.wiki/normal-file.md"                        , "MarkdownTest.wiki/normal-file.md"                    , "../../wiki/normal-file#test"                      , null             , arrayOf<String>()) /* 40 */,
                /* 41 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Wiki Home"                        , "../../wiki/SubDirectory/Home.md"                                        , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>()) /* 41 */,
                /* 42 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "wiki normal file"                 , "../../wiki/normal-file"                                                 , null         , null       , "MarkdownTest.wiki/normal-file.md"                        , "MarkdownTest.wiki/normal-file.md"                    , "../../wiki/normal-file"                           , null             , arrayOf<String>()) /* 42 */,
                /* 43 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "wiki normal file"                 , "../../wiki/In-Name"                                                     , null         , null       , "MarkdownTest.wiki/SubDirectory/In-Name.md"               , "MarkdownTest.wiki/SubDirectory/In-Name.md"           , "../../wiki/In-Name"                               , null             , arrayOf<String>()) /* 43 */,
                /* 44 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "wiki normal file"                 , "../../wiki/In-Name.md"                                                  , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("MarkdownTest.wiki/SubDirectory/In-Name.md")) /* 44 */,
                /* 45 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "wiki normal file"                 , "../../wiki/SubDirectory/In-Name.md"                                     , null         , null       , "MarkdownTest.wiki/SubDirectory/In-Name.md"               , "MarkdownTest.wiki/SubDirectory/In-Name.md"           , "../../wiki/SubDirectory/In-Name.md"               , null             , arrayOf<String>()) /* 45 */,
                /* 46 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Anchor in Name"                   , "../../wiki/anchor-in-name"                                              , "5"          , null       , "MarkdownTest.wiki/anchor-in-name#5.md"                   , "MarkdownTest.wiki/anchor-in-name#5.md"               , "../../wiki/anchor-in-name%235"                    , null             , arrayOf<String>()) /* 46 */,
                /* 47 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "Anchor in Name"                   , "../../wiki/anchor-in-name%235"                                          , null         , null       , "MarkdownTest.wiki/anchor-in-name#5.md"                   , "MarkdownTest.wiki/anchor-in-name#5.md"               , "../../wiki/anchor-in-name%235"                    , null             , arrayOf<String>()) /* 47 */,
                /* 48 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "normal file"                      , "../../wiki/normal-file"                                                 , null         , null       , "MarkdownTest.wiki/normal-file.md"                        , "MarkdownTest.wiki/normal-file.md"                    , "../../wiki/normal-file"                           , null             , arrayOf<String>()) /* 48 */,
                /* 49 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "normal file"                      , "../../wiki/normal-file.md"                                              , null         , null       , "MarkdownTest.wiki/normal-file.md"                        , "MarkdownTest.wiki/normal-file.md"                    , "../../wiki/normal-file.md"                        , null             , arrayOf<String>()) /* 49 */,
                /* 50 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "wiki normal file"                 , "../../wiki/In-Name.md"                                                  , null         , null       , null                                                      , null                                                  , null                                               , null             , arrayOf<String>("MarkdownTest.wiki/SubDirectory/In-Name.md")) /* 50 */,
                /* 51 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::FileLinkRef , "wiki normal file"                 , "../../wiki/SubDirectory/In-Name.md"                                     , null         , null       , "MarkdownTest.wiki/SubDirectory/In-Name.md"               , "MarkdownTest.wiki/SubDirectory/In-Name.md"           , "../../wiki/SubDirectory/In-Name.md"               , null             , arrayOf<String>()) /* 51 */,
                /* 52 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::ImageLinkRef, "vcs image"                        , "vcs-image.png"                                                          , null         , null       , "vcs-image.png"                                           , "vcs-image.png"                                       , "vcs-image.png"                                    , null             , arrayOf<String>("MarkdownTest.wiki/vcs-image.png", "vcs-image.png")) /* 52 */,
                /* 53 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::ImageLinkRef, "sub dir vcs image"                , "SubDirectory/sub-dir-vcs-image.png"                                     , null         , null       , "SubDirectory/sub-dir-vcs-image.png"                      , "SubDirectory/sub-dir-vcs-image.png"                  , "SubDirectory/sub-dir-vcs-image.png"               , null             , arrayOf<String>()) /* 53 */,
                /* 54 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::ImageLinkRef, "non vcs image"                    , "non-vcs-image.png"                                                      , null         , null       , "non-vcs-image.png"                                       , null                                                  , "non-vcs-image.png"                                , null             , arrayOf<String>("MarkdownTest.wiki/non-vcs-image.png", "non-vcs-image.png")) /* 54 */,
                /* 55 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::ImageLinkRef, "sub dir non vcs image"            , "SubDirectory/sub-dir-non-vcs-image.png"                                 , null         , null       , "SubDirectory/sub-dir-non-vcs-image.png"                  , null                                                  , "SubDirectory/sub-dir-non-vcs-image.png"           , null             , arrayOf<String>()) /* 55 */,
                /* 56 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::ImageLinkRef, "vcs image"                        , "../../wiki/vcs-image.png"                                               , null         , null       , "MarkdownTest.wiki/vcs-image.png"                         , "MarkdownTest.wiki/vcs-image.png"                     , "../../wiki/vcs-image.png"                         , null             , arrayOf<String>()) /* 56 */,
                /* 57 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::ImageLinkRef, "sub dir vcs image"                , "../../wiki/SubDirectory/sub-dir-vcs-image.png"                          , null         , null       , "MarkdownTest.wiki/SubDirectory/sub-dir-vcs-image.png"    , "MarkdownTest.wiki/SubDirectory/sub-dir-vcs-image.png", "../../wiki/SubDirectory/sub-dir-vcs-image.png"    , null             , arrayOf<String>()) /* 57 */,
                /* 58 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::ImageLinkRef, "non vcs image"                    , "../../wiki/non-vcs-image.png"                                           , null         , null       , "MarkdownTest.wiki/non-vcs-image.png"                     , null                                                  , "../../wiki/non-vcs-image.png"                     , null             , arrayOf<String>()) /* 58 */,
                /* 59 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/Readme.md", ::ImageLinkRef, "sub dir non vcs image"            , "../../wiki/SubDirectory/sub-dir-non-vcs-image.png"                      , null         , null       , "MarkdownTest.wiki/SubDirectory/sub-dir-non-vcs-image.png", null                                                  , "../../wiki/SubDirectory/sub-dir-non-vcs-image.png", null             , arrayOf<String>()) /* 59 */
                /* @formatter:on */
            )

            if (cleanData) {
                val header = arrayOf(
                        "fullPath",
                        "linkType",
                        "linkText",
                        "linkRef",
                        "linkAnchor",
                        "linkTitle",
                        "resolvesLocal",
                        "resolvesExternal",
                        "linkAddress",
                        "remoteAddress",
                        "multiResolve"
                )

                printData(data, header)
            }
            return data
        }
    }
}